package terceiraAula;

public class JogandoExcecao {

    public static void main(String[] args) {
        System.out.println("Início do método main");
        metodo1();
        System.out.println("fim do método main");
    }

    public static void metodo1() {
        System.out.println("Início do método1");
        metodo2();
        System.out.println("fim do método1");
    }

    public static void metodo2() {
        System.out.println("Início do método2");

        //até agora vimos excecoes que acontecem ao acaso, mas podemos jogar excecoes tb
        //num método saca já desenvolvido em aulas anteriores, caso desse errado faria
        //muito mais sentido devolver uma excecao (mostrando o motivo) doq um boolean false
        //para jogarmos excecao é simples

        throw new IllegalArgumentException("joguei uma exceção");
        //não pode mais ter código daqui para baixo, pois o código acabou de ser interrompido, ou seja,
        // nem compilará algo após o throw
        //System.out.println("fim do método2");
    }

}
