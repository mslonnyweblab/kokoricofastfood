package br.com.manager.resources;

import br.com.manager.basedados.models.Usuario;
import br.com.manager.dto.usuario.CadastroUsuarioDTO;
import br.com.manager.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
        Usuario usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CadastroUsuarioDTO>> findAll() {
        List<Usuario> list = service.findAll();
        List<CadastroUsuarioDTO> listDto = list.stream().map(CadastroUsuarioDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ResponseEntity<Page<CadastroUsuarioDTO>> findpage(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "dataVencimento") String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction
    ) {
        Page<Usuario> list = service.findPage(page, linesPerPage, direction, orderBy);
        Page<CadastroUsuarioDTO> listDto = list.map(CadastroUsuarioDTO::new);
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CadastroUsuarioDTO cadastroUsuarioDTO) {
        Usuario usuario = service.fromDTO(cadastroUsuarioDTO);
        Usuario result = service.insert(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(result.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable Integer id, @Valid @RequestBody CadastroUsuarioDTO usuario) {
        usuario.setId(id);
        service.updateCadastroUsuario(usuario);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
//        try {
//
//        } catch (DataIntegrityViolationException e) {
//            throw new DataIntegrityException("Não é possível excluir um Usuario vinculado");
//        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


    @RequestMapping(value = "/email/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findByEmail(@PathVariable String id) {
        Optional<Usuario> usuario = service.findByEmail(id);
        return ResponseEntity.ok().body(usuario.get());
    }

}
