package br.com.agi.contextosProntos;

import br.com.agi.dados.Dados;

/*
 * Classe de teste, onde o objetivo da classe é ter contextos prontos.
 * tudo o qur for repetir em diversar empresas, poderemos reutilizar o contexto. Ex: O contexto de pegar o CEP e NUMERO,
 * para entrega de um pedido, como tambem pegar um cpf de determinado cliente para saber se possui algum bonus.
 * */
public class ContextosProntos {

    private Dados dados;

    public ContextosProntos(Dados dados) {
        this.dados = dados;
    }

}
