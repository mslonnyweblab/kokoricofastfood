package br.com.gateway.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@EnableResourceServer
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {


    @Autowired
    private JwtTokenStore jwtTokenStore;

    public static final String[] PUBLIC = {"/**"};
    public static final String[] ADMIN = {"/user/user"};
    public static final String[] CLIENTE = {"/user/**"};


    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenStore(jwtTokenStore);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(PUBLIC).permitAll()
                .antMatchers(CLIENTE).hasAnyRole("ADMIN", "CLIENTE")
                .anyRequest().authenticated();
    }


}
