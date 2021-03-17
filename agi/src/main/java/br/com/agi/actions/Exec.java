package br.com.agi.actions;


import br.com.agi.core.ChannelAndRequest;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;

public class Exec {

    private final AgiChannel channel = ChannelAndRequest.getChannel();

    public void exec(String aplication, String options) {
        try {
            int exec = channel.exec(aplication, options);
        } catch (AgiException e) {
            e.printStackTrace();
        }

    }
}
