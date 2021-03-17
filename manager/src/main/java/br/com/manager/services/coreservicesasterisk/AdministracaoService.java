package br.com.manager.services.coreservicesasterisk;

import br.com.manager.basedados.models.Usuario;
import br.com.manager.basedados.repository.UsuarioRepository;
import br.com.manager.dto.usuario.CadastroUsuarioDTO;
import br.com.manager.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AdministracaoService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private HttpServletRequest httpServletRequest;


    public Usuario findById(Integer id) {
        Optional<Usuario> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("OBJETO NÃO ENCONTRADO"));
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario insert(Usuario usuario) {
        usuario.setId(null);

        return repository.save(usuario);
    }

    private Usuario update(Usuario usuario) {
        return repository.save(usuario);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    public Page<Usuario> findPage(Integer page, Integer linesPerPage, String direction, String orderBy) {
        PageRequest pages = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findAll(pages);
    }

    public Usuario fromDTO(CadastroUsuarioDTO cadastroUsuarioDTO) {
        Usuario usuario = new Usuario(cadastroUsuarioDTO);
        return usuario;
    }

    public Optional<Usuario> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public void updateCadastroUsuario(CadastroUsuarioDTO cadastroUsuarioDTO) {
        Map<String, String> atributos = (Map<String, String>) httpServletRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        Integer idUri = Integer.parseInt(atributos.get("id"));

        Optional<Usuario> usuario = repository.findByEmail(cadastroUsuarioDTO.getEmail());

        if (usuario.isPresent() && !usuario.get().getId().equals(idUri)) {
            throw new ObjectNotFoundException("Email já cadastrado na base");
        }

        Usuario atualizar = findById(idUri);

        atualizar.setEmail(cadastroUsuarioDTO.getEmail());
        atualizar.setSenha(cadastroUsuarioDTO.getSenha());
        atualizar.setDataVencimento(cadastroUsuarioDTO.getDataVencimento());
        atualizar.setTelefone(cadastroUsuarioDTO.getTelefone());
        atualizar.setReferencias(cadastroUsuarioDTO.getReferencias());

        repository.save(atualizar);

    }
}