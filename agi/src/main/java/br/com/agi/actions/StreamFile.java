package br.com.agi.actions;

import br.com.agi.configuracoes.ConfigGeneral;
import br.com.agi.core.ChannelAndRequest;
import org.asteriskjava.fastagi.AgiException;
import org.springframework.stereotype.Component;

/*
 * Essa classe tem a responsabilidade de tocar os audios da central pbx.
 * O Método toca pode ser estático, uma vez que as variáveis que representam cada ligação,
 * estão na classe ChannelAndRequest.
 *
 * */
@Component
public class StreamFile {

    public static void toca(String audio) throws AgiException {
        ChannelAndRequest.getChannel().streamFile(ConfigGeneral.getCaminhoAudios() + audio);
    }
}