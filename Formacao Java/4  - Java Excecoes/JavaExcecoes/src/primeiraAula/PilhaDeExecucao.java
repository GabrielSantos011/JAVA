package primeiraAula;

public class PilhaDeExecucao {

    //demonstrando a pilha de execução
    //rodar a aplicação para ver a ordem da execução
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

        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("fim do método2");
    }
}
