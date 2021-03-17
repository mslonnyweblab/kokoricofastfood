package br.com.agi.contextosEmpresas.kokoriko.padrao.etapas;


import br.com.agi.actions.Read;
import br.com.agi.actions.StreamFile;
import br.com.agi.core.PessoaQueEstaLigando;
import br.com.agi.dados.Dados;
import br.com.agi.interfaces.Executa;
import br.com.agi.utils.suporte.Support;
import org.asteriskjava.fastagi.AgiException;
import org.springframework.stereotype.Component;

@Component
public class Opcoes implements Executa {


    private Dados dados;
    private PessoaQueEstaLigando pessoaQueEstaLigando;

    public Opcoes(PessoaQueEstaLigando pessoaQueEstaLigando) {
        this.pessoaQueEstaLigando = pessoaQueEstaLigando;
        this.dados = new Dados(this.pessoaQueEstaLigando);
    }

    @Override
    public void executa() throws AgiException {


        boolean controleWhile = true;

        while (controleWhile) {
            String opcao = Read.run("opcaoMenuPrincipal", "20010", 10, 1);

            switch (Integer.parseInt(opcao)) {
                case 1:
                    controleWhile = false;
                    this.opcao1();
                    break;

                case 2:
                    controleWhile = false;
                    this.opcao2();
                    break;

                case 3:
                    controleWhile = false;
                    this.opcao3();
                    break;

                case 4:
                    controleWhile = false;
                    this.opcao4();
                    break;

                default:
                    Support.time(2000);
                    StreamFile.toca("828");
                    break;
            }
        }
    }


    // Vai a lógica da primeira opção
    public void opcao1() throws AgiException {
        throw new AgiException("Final do programa");
    }

    // Vai a lógica da segunda opção
    public void opcao2() throws AgiException {

    }

    //
    public void opcao3() throws AgiException {
        throw new AgiException("Final do programa");
    }

    //
    public void opcao4() throws AgiException {
        throw new AgiException("Final do programa");
    }

    //
    public void opcao5() throws AgiException {
        throw new AgiException("Final do programa");
    }


    public Dados getDados() {
        return dados;
    }


    public PessoaQueEstaLigando getPessoaQueEstaLigando() {
        return pessoaQueEstaLigando;
    }

    public void setPessoaQueEstaLigando(PessoaQueEstaLigando pessoaQueEstaLigando) {
        this.pessoaQueEstaLigando = pessoaQueEstaLigando;
    }

}