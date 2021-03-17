package br.com.agi.teste;

import br.com.agi.core.ChannelAndRequest;
import br.com.agi.models.Usuarios;
import br.com.agi.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configurable
@Component
public class TesteVarAgi {

    /*
     * OBJETIVO: BUSCAR DADOS DO CLIENTE, PARA CONSEGUIR MANEJAR A APLICAÇÃO DE ACORDO COM O CONTRATADO PELO CLIENTE.
     *
     * BUSCAR NÚMERO QUE ESTÁ LIGANDO. PARA QUÊ?
     * 1° - PARA SABER QUAL CONTEXTO CONTRATADO.
     * 2° - PARA SABER SE POSSUI CONFIRMAÇÃO DE SMS.
     * 3° - PARA SABER ONDE ENVIAR O EMAIL.
     * 4° - PARA SABER
     * */
    public TesteVarAgi() {
    }


    @Autowired
    private UsuariosService usuariosService;

    public void run() {
        System.out.println("IMPRIMINDO O CANAL " + ChannelAndRequest.getChannel());
        System.out.println("IMPRIMINDO O CALLER-ID " + ChannelAndRequest.getRequest().getCallerId());
        System.out.println("IMPRIMINDO O CALLER-ID-NUMBER  " + ChannelAndRequest.getRequest().getCallerIdNumber());
        System.out.println("IMPRIMINDO A REQUISIÇÃO " + ChannelAndRequest.getRequest());
        System.out.println("IMPRIMINDO A DNID " + ChannelAndRequest.getRequest().getDnid());
        System.out.println("IMPRIMINDO A EXTENSIONS " + ChannelAndRequest.getRequest().getExtension());
        System.out.println("IMPRIMINDO A CONTEXTO " + ChannelAndRequest.getRequest().getContext());
        System.out.println("IMPRIMINDO A CALLER-ID-NAME " + ChannelAndRequest.getRequest().getCallerIdName());
        System.out.println("IMPRIMINDO A CHANNEL " + ChannelAndRequest.getRequest().getChannel());
        System.out.println("IMPRIMINDO A PARAMETRO " + Arrays.toString(ChannelAndRequest.getRequest().getArguments()));


        Usuarios user = usuariosService.getUserByEmail("click@gmail.com");


        System.out.println("IMPRIMINDO USER --->>> " + user);

    }


}