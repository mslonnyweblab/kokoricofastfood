package br.com.agi.validacoes;

import br.com.agi.actions.Read;
import br.com.agi.core.PessoaQueEstaLigando;
import br.com.agi.interfaces.Valida;
import br.com.agi.utils.validacoes.Validador;
import org.asteriskjava.fastagi.AgiException;


/*
 * As classes de validação terão setadas nelas, os áudios, que irão usar.
 * Dessa forma não será necessário passá-los na chamdada do código em execução.
 */
public class ValidaCpf implements Valida {


    private PessoaQueEstaLigando pessoaQueEstaLigando;

    private static final String SOM_PADRAO = "400";
    private static final Integer TEMPO_DE_ESPERA_MAXIMO = 13000;
    private static final Integer MAXIMO_DIGITOS = 11;
    private static final Integer MAXIMO_TENTATIVAS = 3;


    private static final String OPCAO_INVALIDA = "821";
    private static final String AUTO_DESLIGAMENTO = "818";
    private static final String UMA_TENTATIVA = "850";
    private static final String DUAS_TENTATIVAS = "849";


    public ValidaCpf(PessoaQueEstaLigando pessoaQueEstaLigando) {
        this.pessoaQueEstaLigando = pessoaQueEstaLigando;
    }

    @Override
    public boolean valida() throws AgiException {

        String cpf = Read.run("cpf", SOM_PADRAO, TEMPO_DE_ESPERA_MAXIMO, MAXIMO_DIGITOS);

        this.pessoaQueEstaLigando.setCpf("NÃO INFORMADO");

        if (Validador.isCPF(cpf)) {
            this.pessoaQueEstaLigando.setCpf(cpf);
            return true;
        }

        return false;

    }

    @Override
    public String getOpcaoInvalida() {
        return ValidaCpf.OPCAO_INVALIDA;
    }

    @Override
    public String getAutoDesligamento() {
        return ValidaCpf.AUTO_DESLIGAMENTO;
    }

    @Override
    public String getUmaTentativa() {
        return ValidaCpf.UMA_TENTATIVA;
    }

    @Override
    public String getDuasTentativas() {
        return ValidaCpf.DUAS_TENTATIVAS;
    }

    @Override
    public Integer getMaximoTentativas() {
        return ValidaCpf.MAXIMO_TENTATIVAS;
    }

    public PessoaQueEstaLigando getPessoaQueEstaLigando() {
        return pessoaQueEstaLigando;
    }

    public void setPessoaQueEstaLigando(PessoaQueEstaLigando pessoaQueEstaLigando) {
        this.pessoaQueEstaLigando = pessoaQueEstaLigando;
    }
}