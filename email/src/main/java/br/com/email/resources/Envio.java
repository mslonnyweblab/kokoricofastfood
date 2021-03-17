package br.com.email.resources;


import br.com.email.IO.dto.EmailSuperClasseDto;
import br.com.email.IO.form.EmailSuperClasseForm;
import br.com.email.services.EnvioDeEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class Envio {

    @Autowired
    private EnvioDeEmailService envioDeEmailService;


//    @HystrixCommand(fallbackMethod = "enviaEmailAlternativo")
    @PostMapping
    public ResponseEntity<String> enviaEmail(@RequestBody EmailSuperClasseForm padraoForm) {

        EmailSuperClasseDto padraoDto = new EmailSuperClasseForm().toPadraoDto(padraoForm);

        envioDeEmailService.enviaEmail(padraoDto);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

//    public ResponseEntity<String> enviaEmailAlternativo(@RequestBody PadraoDto padraoDto) {
//        envioDeEmailService.enviaEmail();
//        return ResponseEntity.ok("Foi pelo alternativo");
//    }
}