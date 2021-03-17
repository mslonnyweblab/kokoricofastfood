package br.com.agi.contextosEmpresas.kokoriko.padrao;


import br.com.agi.EnvioDeDados.sms.dto.SmsDto;
import br.com.agi.EnvioDeDados.sms.implementacao.EnviaSmsImpl;
import br.com.agi.contextosEmpresas.kokoriko.padrao.etapas.Opcoes;
import br.com.agi.estruturas.estruturaUra.EsqueletoUraTempl;
import br.com.agi.support.Horas;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.asteriskjava.fastagi.AgiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AtendimentoPadraoKokoriko extends EsqueletoUraTempl {

    @Autowired
    private EnviaSmsImpl enviaSmsImpl;

    @Autowired
    private Opcoes opcoes;

    @Override
    protected void implementacaoHeader() throws AgiException {
        System.out.println("Startando o HEADER ___");
        //  SAUDAÇÕES
        new Horas().getPeriod();
    }

    @Override
    protected void implementacaoBody() throws AgiException {
        System.out.println("Startando o BODY ___");

        new Opcoes(getPessoaQueEstaLigando()).executa();
    }

    @Override
    protected void implementacaoFooter() throws AgiException {

        System.out.println("Startndo o FOOTER ___");

    }


    @HystrixCommand(fallbackMethod = "alternateSms")
    @Override
    public void envioSms() {
        SmsDto smsDto = SmsDto.protocolo();

        enviaSmsImpl.enviaPost(smsDto);
    }

    public void alternateSms() {

        System.out.println("CAÍ NO METODO DE FALLBACK DO HYSTRIX");

    }

}