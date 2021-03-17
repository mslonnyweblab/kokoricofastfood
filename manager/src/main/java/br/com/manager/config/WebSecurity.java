//package br.com.manager.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//
//    public static final String[] PUBLIC = {"/**"};
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(PUBLIC).permitAll()
//                .anyRequest().authenticated();
//    }
//}