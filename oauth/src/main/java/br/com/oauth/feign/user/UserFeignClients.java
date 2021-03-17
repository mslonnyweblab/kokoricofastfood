package br.com.oauth.feign.user;

import br.com.oauth.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@FeignClient(name = "BASE-CREDENTIALS", path = "/user")
public interface UserFeignClients {

    @GetMapping(value = "/search")
    User findByEmail(@RequestParam String email);
}
