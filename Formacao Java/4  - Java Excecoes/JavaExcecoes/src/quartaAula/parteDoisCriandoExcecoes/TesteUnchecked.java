package quartaAula.parteDoisCriandoExcecoes;

public class TesteUnchecked {

    //como não houve tratamento os métodos serão interrompidos abruptamente
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

    //não somos obrigados a tratar ou colocar throws na assinatura
    public static void metodo2() {
        System.out.println("Início do método2");
        throw new ExcecaoUnchecked("teste excecao unchecked");
    }

}
