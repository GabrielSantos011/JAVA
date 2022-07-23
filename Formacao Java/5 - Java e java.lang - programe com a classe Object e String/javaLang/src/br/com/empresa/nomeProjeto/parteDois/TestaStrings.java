package br.com.empresa.nomeProjeto.parteDois;

public class TestaStrings {

    public static void main(String[] args) {
        //aprendemos sobre os imports, porém se repararmos o método main recebe uma String
        //String tem a inicial maiúscula então estamos falando de uma classe
        //de onde essa classe vem? Vem do pacote java.lang
        //este pacote é tão fundamental que o java já importa ele automáticamente

        //Strings

        //object literal - não precisamos dar o new para criar um objeto
        String string = "Gabriel";
        //embora funcione (má pratica)
        //String a = new String("A")

        //String é imutavel, seus métodos devolvem outra String e não alteram o Objeto atual
        //ou seja, se executarmos
        string.toLowerCase();
        //ele devolverá outra string mas a nossa continua com a inicial maiúscula
        System.out.println(string);

        //agora guardamos o resultado
        string = string.toLowerCase();

        System.out.println(string);

        //como a String é imutavel para fazer concatenações perdemos desempenho
        //pois ela sempre criará um novo objeto
        //para concatenar temos StringBuilder (que tb implementa CharSequence)
        //e é mutavél, dando assim um maior desempenho

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a ");
        stringBuilder.append("b ");
        stringBuilder.append("c ");

        System.out.println(stringBuilder);

        string = stringBuilder.toString();
        System.out.println(string);

        //vale a pena olhar o javadoc da classe string para ver os métodos
    }

}
