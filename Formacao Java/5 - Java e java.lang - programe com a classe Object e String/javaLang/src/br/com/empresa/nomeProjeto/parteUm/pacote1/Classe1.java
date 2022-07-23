//primeira coisa do arquivo é o package
package br.com.empresa.nomeProjeto.parteUm.pacote1;

//segunda coisa são os imports
import br.com.empresa.nomeProjeto.parteUm.pacote2.Classe3;

//só então vem a classe

/**
 * Isto é um javadoc, uma documentação de dev para dev
 * @author Gabriel
 */
public class Classe1 {

    /**
     * método main
     * @param args
     */
    public static void main(String[] args) {
        //Classe 4 está no mesmo pacote então n precisa de import nem do FQN
        Classe4 classe4 = new Classe4();

        //outros pacotes

        //full qualified name - FQN
        br.com.empresa.nomeProjeto.parteUm.pacote2.Classe2 classe2 =
                new br.com.empresa.nomeProjeto.parteUm.pacote2.Classe2();

        //os imports facilitam nossas vidas
        Classe3 classe3 = new Classe3();

//        public - visivel para todos em qualquer lugar
//        private - visivel so na classe
//        protected - visivel no pacote e publico para filhos (independente do pacote)
//        package (quando n tem nada na frente) - visivel no pacote
    }

}
