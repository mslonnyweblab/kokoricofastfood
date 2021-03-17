package br.com.agi.service;

import br.com.agi.exceptions.ObjectNotFoundException;
import br.com.agi.models.Usuarios;
import br.com.agi.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository repository;


    public Usuarios getUserByEmail(String user) {
        Optional<Usuarios> email = repository.findByEmail(user);
        return email.orElse(null);
    }

    public Usuarios getUserByNumero(String numero) {
        Optional<Usuarios> usuarios = repository.findByNumero(numero);
        return usuarios.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
    }
}
