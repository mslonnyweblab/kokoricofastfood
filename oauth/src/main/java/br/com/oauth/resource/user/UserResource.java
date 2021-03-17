package br.com.oauth.resource.user;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@EnableResourceServer
@RestController
@RequestMapping
public class UserResource {

    @HystrixCommand(fallbackMethod = "principalAlternative")
    @GetMapping(value = "/user")
    public Principal principal(Principal principal) {
        System.out.println("-------------metodo-principal-------------");
        System.out.println("-------------"+ principal +"-------------");
        return principal;
    }

    public Principal principalAlternative(Principal principal) {
        System.out.println("-------------metodo-principal-alternative-------------");
        System.out.println("-------------"+ principal +"-------------");
        return principal;
    }
}