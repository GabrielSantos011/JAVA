package quartaAula.parteUm;

public class SimulaErro {

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

        metodo2();
        //não será utilizado
        System.out.println("fim do método2");
    }

}
