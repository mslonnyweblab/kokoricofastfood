package br.com.agi.configuracoes;

import br.com.agi.core.StartAgi;
import org.asteriskjava.fastagi.DefaultAgiServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class ConfigsAsterisk implements Runnable {

    private final int portDefaultAgiServer = 5599; //5599;

    @Autowired
    private StartAgi startAgi;

    public synchronized void startServer() throws IOException {
        DefaultAgiServer server = new DefaultAgiServer(startAgi);
        server.setPort(this.portDefaultAgiServer);
        int maximumPoolSize = 1000;
        server.setMaximumPoolSize(maximumPoolSize);
        server.startup();
    }

    @Override
    public void run() {
        try {
            startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}