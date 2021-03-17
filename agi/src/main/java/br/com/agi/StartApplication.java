package br.com.agi;

import br.com.agi.core.ChannelAndRequest;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;

public class StartApplication {


    public void executa(AgiRequest request, AgiChannel channel) throws AgiException {
        // PEGA AS VARIÁVEIS REQUEST E CHANNEL E JOGA NO SISTEMA
        new ChannelAndRequest.ChannelAndRequestBuilder(channel, request).build();
        channel.answer();

    }
}
