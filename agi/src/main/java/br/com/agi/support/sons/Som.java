package br.com.agi.support.sons;

import br.com.agi.actions.StreamFile;
import org.asteriskjava.fastagi.AgiException;

/*
 * o objetivo dessa classe é ter sons pelo nome;
 *  Ex: o som de 'bom dia', poderá ser chamada pela função 'bomDia()'
 * */
public class Som {

    /*
     *  TECLAS
     *********************************************/
    public static void tecle0() throws AgiException {
        StreamFile.toca("442");
    }

    public static void tecle1() throws AgiException {
        StreamFile.toca("433");
    }

    public static void tecle2() throws AgiException {
        StreamFile.toca("434");
    }

    public static void tecle3() throws AgiException {
        StreamFile.toca("435");
    }

    public static void tecle4() throws AgiException {
        StreamFile.toca("436");
    }

    public static void tecle5() throws AgiException {
        StreamFile.toca("437");
    }

    public static void tecle6() throws AgiException {
        StreamFile.toca("438");
    }

    public static void tecle7() throws AgiException {
        StreamFile.toca("439");
    }

    public static void tecle8() throws AgiException {
        StreamFile.toca("440");
    }

    public static void tecle9() throws AgiException {
        StreamFile.toca("441");
    }


}
