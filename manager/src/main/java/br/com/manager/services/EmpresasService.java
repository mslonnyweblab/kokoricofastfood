package br.com.manager.services;

import br.com.manager.basedados.models.Empresa;
import br.com.manager.basedados.repository.EmpresasRepository;
import br.com.manager.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresasService {

    @Autowired
    private EmpresasRepository empresasRepository;


    public Empresa findById(int id) {
        Optional<Empresa> banco = empresasRepository.findById(id);
        return banco.orElseThrow(() -> new ObjectNotFoundException("OBJETO NÃO ENCONTRADO"));
    }

    public List<Empresa> findAll() {
        return empresasRepository.findAll();
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    public void deleteById(int id) {
//        try {
//            bancoRepository.deleteById(id);
//        } catch (DataIntegrityViolationException e) {
//            throw new DataIntegrityException("erro na exclusao");
//        }


    }
}
