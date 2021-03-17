//package br.com.pbx.managerPbx.configuracoes.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        super.configure(web);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        String[] url = {
//                "/ligar", "/ligar/**"
//        };
//
//        http.csrf().disable();
//
//        http.authorizeRequests()
//                .antMatchers(url).permitAll();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
//    }
//}
