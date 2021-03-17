package br.com.manager.services;

import br.com.manager.basedados.models.Provedor;
import br.com.manager.basedados.models.Telefone;
import br.com.manager.basedados.repository.IpRepository;
import br.com.manager.basedados.repository.ProvedorRepository;
import br.com.manager.basedados.repository.TelefoneRepository;
import br.com.manager.dto.provedor.CadastroProvedorForm;
import br.com.manager.dto.provedor.UpdateProvedorForm;
import br.com.manager.exceptions.ObjectNotFoundException;
import br.com.manager.utils.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Service
public class ProvedorService {

    @Autowired
    private ProvedorRepository repository;

    @Autowired
    private IpRepository ipRepository;

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private HttpServletRequest httpServletRequest;


    public Provedor findById(int id) {
        Optional<Provedor> provedor = repository.findById(id);
        return provedor.orElseThrow(() -> new ObjectNotFoundException("OBJETO NÃO ENCONTRADO"));
    }

    public List<Provedor> findByAll() {
        List<Provedor> provedor = repository.findAll();

        if (provedor.isEmpty()) {
            throw new ObjectNotFoundException("OBJETO NÃO ENCONTRADO");
        }

        return provedor;
    }

    public List<Provedor> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Provedor insert(Provedor usuario) {
        usuario.setId(null);

        telefoneRepository.saveAll(usuario.getTelefone());
        return repository.save(usuario);
    }

    private Provedor update(Provedor usuario) {
        return repository.save(usuario);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    public Page<Provedor> findPage(Integer page, Integer linesPerPage, String direction, String orderBy) {
        PageRequest pages = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findAll(pages);
    }


    @Transactional
    public void updateProvedor(UpdateProvedorForm updateProvedorForm) {
        Integer idRequest = new Request().getIdRequest(httpServletRequest);

        Provedor provedor = repository.findById(idRequest).get();

        provedor.setSite(updateProvedorForm.getSite());
        provedor.setObservacoes(updateProvedorForm.getObservacoes());
        provedor.setEmailContato(updateProvedorForm.getEmailContato());
        provedor.setNomeServidor(updateProvedorForm.getNomeServidor());
        provedor.setPorta(updateProvedorForm.getPorta());
        provedor.getIp().addAll(updateProvedorForm.getIp());
        provedor.setDominios(updateProvedorForm.getDominios());

        provedor.setDominioPrincipal(updateProvedorForm.getDominioPrincipal());


        removeRepetidos(updateProvedorForm.getTelefone());

        provedor.getTelefone().addAll(updateProvedorForm.getTelefone());

        telefoneRepository.saveAll(updateProvedorForm.getTelefone());

        repository.save(provedor);
    }

    @Transactional
    public Provedor cadastraProvedor(CadastroProvedorForm cadastroProvedorForm) {
        Provedor provedor = new Provedor();

        provedor.setSite(cadastroProvedorForm.getSite());

        provedor.setObservacoes(cadastroProvedorForm.getObservacoes());

        provedor.setEmailContato(cadastroProvedorForm.getEmailContato());

        provedor.setNomeServidor(cadastroProvedorForm.getNomeServidor());

        provedor.setDominioPrincipal(cadastroProvedorForm.getDominioPrincipal());

        provedor.setEmailContato(cadastroProvedorForm.getEmailContato());

        provedor.setPorta(cadastroProvedorForm.getPorta());

        provedor.setIp(cadastroProvedorForm.getIp());

        provedor.setDominios(cadastroProvedorForm.getDominios());

        // REMOVENDO OS TELEFONES REPETIDOS QUE FORAM ENVIADOS
        removeRepetidos(cadastroProvedorForm.getTelefone());

        provedor.setTelefone(cadastroProvedorForm.getTelefone());

        ipRepository.saveAll(provedor.getIp());



        return insert(provedor);
    }

    private void removeRepetidos(List<Telefone> lista) {
//        Iterator<Telefone> iterator = lista.iterator();
//        while (iterator.hasNext()) {
//            Optional<Telefone> result = repository.findByTelefone(iterator.next().getNumero());
//            if (result.isPresent()) {
//                iterator.remove();
//            }
//        }
    }


}


