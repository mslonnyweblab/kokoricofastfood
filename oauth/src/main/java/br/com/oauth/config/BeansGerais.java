package br.com.oauth.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;


/*
 *
 * A única finalidade dessa classe, é:
 * definir alguns Beans para a utilização em outros pontos da aplicação.
 *
 */
@RefreshScope
@Configuration
public class BeansGerais {


    @Value("${security.token.secretPassToken}")
    private String secretPassToken;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /*
     * Criptografa o token, usando uma chave definida.
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
        tokenConverter.setSigningKey(secretPassToken);
        return tokenConverter;
    }


    /*
     * Esse objeto está responsável por ler as informações do Token.
     * Para ler essas informações, é necessário utilizar a chave de criptografia
     * então eu passo para a instância de JwtTokenStore, a chamada de jwtAccessTokenConverter(),
     * pois é esse método que sabe a chave do token;
     */
    @Bean
    public JwtTokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }
}
