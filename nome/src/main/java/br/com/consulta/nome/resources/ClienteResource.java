package br.com.consulta.nome.resources;

import br.com.consulta.nome.services.ClienteServices;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/cliente")
public class ClienteResource {

    @Autowired
    private ClienteServices clienteServices;

    @HystrixCommand(fallbackMethod = "consultaNomeAlternative")
    @GetMapping
    public void consultaNome() {
        clienteServices.consultaNome();
    }

    public void consultaNomeAlternative() {
        clienteServices.consultaNome();
    }
}
