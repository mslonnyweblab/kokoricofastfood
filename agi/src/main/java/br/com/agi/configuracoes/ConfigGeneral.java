package br.com.agi.configuracoes;

import org.springframework.stereotype.Component;

@Component
public class ConfigGeneral {

    private static final String PREFIXO_PAIS = "55";
    private static final String CAMINHO_AUDIOS = "/audio/";

    public ConfigGeneral() {
    }


    public static String getPrefixoPais() {
        return PREFIXO_PAIS;
    }

    public static String getCaminhoAudios() {
        return CAMINHO_AUDIOS;
    }
}
