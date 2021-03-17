package br.com.gateway.service;

import br.com.gateway.entity.User;
import br.com.gateway.feign.ValidToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ValidToken validToken;

    public User validaToken() {

        return validToken.findByPrincipal();

    }
}
