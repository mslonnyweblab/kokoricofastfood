package br.com.email.support;

import br.com.email.entidades.Frases;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Suporte {


    public static String converteFromReal(Integer valor) {

        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor);

    }

    public static String getFrase() {
        Random random = new Random();
        int numero = random.nextInt(10);
        if (numero > 10 || numero < 1) {
            numero = 5;
        }

        return Frases.toFrase(numero);
    }
}
