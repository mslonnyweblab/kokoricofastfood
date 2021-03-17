package br.com.oauth.services.user;

import br.com.oauth.entity.User;
import br.com.oauth.feign.user.UserFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserFeignClients userFeignClients;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("CHAMOU O SERVICE - FUNÇÃO LOAD-BY-USERNAME " + username);
        User email = userFeignClients.findByEmail(username);
        System.out.println("OBJETO CARREGADO DA BASE " + email);
        return email;
    }
}
