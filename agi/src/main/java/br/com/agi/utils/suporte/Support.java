package br.com.agi.utils.suporte;

public class Support {


    public static void time(Integer miliSeconds) {
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
