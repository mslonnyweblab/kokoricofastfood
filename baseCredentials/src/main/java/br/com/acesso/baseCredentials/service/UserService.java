package br.com.acesso.baseCredentials.service;

import br.com.acesso.baseCredentials.entity.User;
import br.com.acesso.baseCredentials.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id) {
        Optional<User> optional = userRepository.findById(id);
//        optional.isPresent();
        return optional.get();

    }

    public User findByEmail(String email) {
        Optional<User> optional = userRepository.findByEmail(email);
        return optional.orElseThrow(() -> new RuntimeException("OBJETO NÃO ENCONTRADO"));
    }


}
