package br.com.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


/*
*
* Cada MICRO-SERVIÇO, para conseguir servir recursos protegidos, deve utilizar no projeto as dependencias de
* "OAUTH2 E SECURITY". Iremos configurar os MICRO-SERVIÇOS, para que ao receber um TOKEN, ele possa validá-lo antes
* de entregar o recurso requerido.
*
* É importante frisar que, cada, micro serviço, é responsável, por porteger seus end-points. Por mais que o zuul, faça
* um pedaço dessa tarefa.
*
* Como o MICRO-SERVIÇO, obterá o TOKEN ?
* R:
*
* Como o MICRO-SERVIÇO, validará o TOKEN ?
* R: O MICRO-SERVIÇO, precisa aprender, como validar o TOKEN, e fazemos isso, passando uma configuração no
* application.properties. SECURITY.OAUTH2.RESOURCE.USER-INFO-URI= { ENDEREÇO DO SERVIDOR DE AUTORIZAÇÃO MAIS O END-POIND
* QUE RETORNA O PRINCIPAL } EXAMPLE: HTTP://LOCALHOST:40000/USER
*
*
*
*
*
*/
@Configuration
public class ResourceServer extends ResourceServerConfigurerAdapter {



    /*
    * Cada micro serviço, terá sua barreira de proteção em relação o acesso das URL'S.
    * Lembrando que, devemos passar o token da requesição, como Oauth2 e não apenas Bearer.
    */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
