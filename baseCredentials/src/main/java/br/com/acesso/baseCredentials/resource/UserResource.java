package br.com.acesso.baseCredentials.resource;


import br.com.acesso.baseCredentials.entity.User;
import br.com.acesso.baseCredentials.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;


    @HystrixCommand(fallbackMethod = "findByEmailAlternative")
    @GetMapping(value = "/search")
    public User findByEmail(@RequestParam String email) {
        User user = userService.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("Erro ao puxar usuario");
        }

        return user;
    }

    public User findByEmailAlternative(String email) {
        User user = userService.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("Erro ao puxar usuario");
        }

        return user;
    }

}
