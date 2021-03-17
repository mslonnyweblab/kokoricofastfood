package br.com.agi.core;


import br.com.agi.EnvioDeDados.email.implementacao.EnviaEmailImpl;
import br.com.agi.StartApplication;
import br.com.agi.contextosEmpresas.StartContexto;
import br.com.agi.contextosEmpresas.kokoriko.padrao.AtendimentoPadraoKokoriko;
import br.com.agi.exceptions.ObjectNotFoundException;
import br.com.agi.models.Usuarios;
import br.com.agi.service.UsuariosService;
import br.com.agi.teste.TesteVarAgi;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StartAgi extends BaseAgiScript {

    @Autowired
    private UsuariosService usuariosService;

    @Autowired
    private AtendimentoPadraoKokoriko atendimentoPadraoKokoriko;

    @Autowired
    private TesteVarAgi testeVarAgi;

    @Autowired
    private EnviaEmailImpl enviaEmail;

    @Autowired
    private StartContexto startContexto;

    public void service(AgiRequest request, AgiChannel channel) {
        try {
            new StartApplication().executa(request, channel);

            Usuarios usuario = usuariosService.getUserByNumero(ChannelAndRequest.getRequest().getDnid());

            String atendimento = usuario.getContexto();

            startContexto.iniciaContexto(atendimento);

            testeVarAgi.run();
            channel.hangup();
            throw new AgiException("Final do programa");

        } catch (AgiException e) {
            System.out.println(atendimentoPadraoKokoriko.getPessoaQueEstaLigando());
            System.out.println("PRIMEIRO CATCH DE FINALIZAÇÃO !!!");
            System.out.println("--------------------------------------------");
            enviaEmail.enviaPost(atendimentoPadraoKokoriko.getPessoaQueEstaLigando());
            System.out.println("--------------------------------------------");

        } catch (ObjectNotFoundException e) {
            System.out.println("NÚMERO NÃO ENCONTRADO, FINALIZANDO A LIGAÇÃO !!! " + e.getMessage());

        }
    }

}