package br.com.manager.services;

import br.com.manager.basedados.models.Contexto;
import br.com.manager.basedados.repository.ContextoRepository;
import br.com.manager.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContextoService {

    @Autowired
    private ContextoRepository contextoRepository;


    public Contexto findById(int id) {
        Optional<Contexto> contexto = contextoRepository.findById(id);
        return contexto.orElseThrow(() -> new ObjectNotFoundException("OBJETO NÃO ENCONTRADO"));
    }

    public List<Contexto> findAll() {

        return contextoRepository.findAll();
    }

    public void deleteById(int id) {
        contextoRepository.deleteById(id);
    }
}
