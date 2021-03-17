package br.com.agi.contextosEmpresas;

import br.com.agi.contextosEmpresas.kokoriko.padrao.AtendimentoPadraoKokoriko;
import br.com.agi.core.ChannelAndRequest;
import org.asteriskjava.fastagi.AgiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* Classe responsável por selecionar para qual empresa a ligação será direcionada
* levando em consideração que podemos usar a mesma central para diversar empresas.
*
* */
@Component
public class StartContexto {

    @Autowired
    private AtendimentoPadraoKokoriko atendimentoPadraoKokoriko;

    public StartContexto() {
    }

    /* FAZ O REDIRECONAMENTO DO ATENDIMENTO DE ACORDO COM O CONTRATADO PELO CLIENTE.
     * ESSA TÉCNICA VINCULA UM NÚMERO QUE UM USUÁRIO ESTÁ LIGANDO, COM UM CONTEXTO.
     */
    public void iniciaContexto(String atendimento) throws AgiException {

        System.out.println("ATENDIMENTO PASSADO POR PARAMETRO " + atendimento);

        switch (atendimento) {
            case "atendimento-1":
                System.out.println("ATENDIMENTO KOKORIKO-FASTFOOD  -->>  " + atendimento);
                atendimentoPadraoKokoriko.iniciaUra();
                break;

            case "atendimento-2":
                System.out.println("ATENDIMENTO LONNY-WEB  -->>  " + atendimento);

                break;

            default:
                System.out.println("VIEMOS PARA O DEFAULT");
                ChannelAndRequest.getChannel().hangup();
                break;
        }
    }
}
