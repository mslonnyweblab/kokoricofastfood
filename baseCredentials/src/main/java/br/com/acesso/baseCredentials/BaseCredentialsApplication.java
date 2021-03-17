package br.com.acesso.baseCredentials;

import br.com.acesso.baseCredentials.entity.Roles;
import br.com.acesso.baseCredentials.entity.User;
import br.com.acesso.baseCredentials.repository.RolesRepository;
import br.com.acesso.baseCredentials.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.Optional;


@EnableEurekaClient
@SpringBootApplication
public class BaseCredentialsApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(BaseCredentialsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        User user1 = new User(null, "click", "click@gmail", bCryptPasswordEncoder.encode("123456"));
//        User user2 = new User(null, "lara", "lara@gmail", bCryptPasswordEncoder.encode("123456789"));
//
//
//        Roles roles_admin = new Roles("ROLE_ADMIN");
//        Roles roles_operador = new Roles("ROLE_OPERADOR");
//
//        user1.getRoles().addAll(Arrays.asList(roles_admin));
//        user2.getRoles().addAll(Arrays.asList(roles_operador));
//
//
//        rolesRepository.saveAll(Arrays.asList(roles_admin, roles_operador));
//
//        userRepository.saveAll(Arrays.asList(user1, user2));
//
//        Optional<User> email = userRepository.findByEmail("lara@gmail");
//
//        if (email.isPresent()) {
//            System.out.println("Saudações CLICK " + email.get());
//        } else {
//            System.out.println("Não veio nada !!!");
//        }
    }

}