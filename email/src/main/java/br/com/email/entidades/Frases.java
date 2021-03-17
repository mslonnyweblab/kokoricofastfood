package br.com.email.entidades;

public enum Frases {
    FRASE1(1, "Um dia é preciso parar de sonhar, tirar os planos da gaveta e, de algum modo, começar"),
    FRASE2(2, "Sonhos são adoráveis. Mas são só sonhos. São fugazes, efêmeros, bonitos. Sonhos não se tornaram realidade só porque você sonhou. É o esforço que faz as coisas acontecerem. É o esforço que cria mudança"),
    FRASE3(3, "Para ter um negócio de sucesso, alguém, algum dia, teve que tomar uma atitude de coragem"),
    FRASE4(4, "Falhar é uma parte importante para o seu crescimento e para que você desenvolva resiliência. Não tenha medo das falhas! "),
    FRASE5(5, "Daqui a 20 anos você estará mais decepcionado pelas coisas que você não fez, do que pelas que fez. Então, jogue fora suas amarras, navegue para longe do porto seguro, pegue os ventos em suas velas. Explore, sonha, descubra"),
    FRASE6(6, "Tudo que você pode fazer, ou sonha que pode, comece. Ousadia tem genialidade, poder e magia"),
    FRASE7(7, "Pessoas não compram o que você faz. Elas compram o porquê você faz."),
    FRASE8(8, "Você nunca deve ver os seus desafios como uma desvantagem. Em vez disso, é importante entender que as experiências que você adquire enquanto enfrenta e supera as adversidades é, na verdade, uma das suas maiores vantagens"),
    FRASE9(9, "Faça simples. Faça memorável. Faça convidativo ao olhar. Faça divertido para ler"),
    FRASE10(10, "Normalmente as oportunidades estão disfarçadas de trabalho duro, é por isso que a maioria das pessoas não as reconhecem");

    private Integer cod;
    private String texto;


    Frases(Integer cod, String texto) {
        this.cod = cod;
        this.texto = texto;
    }

    public Integer getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }

    public static String toFrase(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (Frases frase : Frases.values()) {
            if (frase.getCod().equals(cod)) {
                return frase.getTexto();
            }
        }

        throw new IllegalArgumentException("Argumento Inválido");
    }
}
