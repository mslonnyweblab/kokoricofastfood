package br.com.agi.actions;


import br.com.agi.configuracoes.ConfigGeneral;
import br.com.agi.core.ChannelAndRequest;
import org.asteriskjava.fastagi.AgiException;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Read {


    private static final String pathSom = ConfigGeneral.getCaminhoAudios();


    /* A lógica do código é setar uma variável para depois pegá-la com o channel.
     * Ter uma maleabilidade com o tempo de espera, máximo de dígitos e o som que irá tocar. */
    public static String run(String nomeVar, String fileOfSound, Integer seconds, Integer maxDigits) throws AgiException {

        Objects.requireNonNull(nomeVar, "nomeVar não pode ser null.");
        Objects.requireNonNull(fileOfSound, "fileOfSound não pode ser null.");
        Objects.requireNonNull(seconds, "seconds não pode ser null.");
        Objects.requireNonNull(maxDigits, "maxDigits não pode ser null.");


        String data = null;

            data = ChannelAndRequest.getChannel().getData(pathSom + fileOfSound, Long.valueOf(seconds), maxDigits);
            ChannelAndRequest.getChannel().setVariable(nomeVar, data);
            return data;

    }
}


//    Syntax
//    Read(variable,filename&[filename2[&...]],[maxdigits,[options,[attempts,[timeout]]]]])
//    int numero = ChannelAndRequest.channel.exec("read", "numero," + ConfiguracoesDeServicos.CAMINHO_AUDIOS.getValor() + "206, 10");
