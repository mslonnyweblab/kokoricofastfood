package br.com.gateway.feign;

import br.com.gateway.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "OAUTH")
public interface ValidToken {

    @GetMapping("/user")
    User findByPrincipal();

}