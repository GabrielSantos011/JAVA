package segundaAula;

public class TestaMetodos {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        //chamada de método
        conta1.deposita(100);
        conta2.deposita(1300);

        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);

        conta1.saca(10);
        conta2.saca(150);

        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);

        conta2.transfere(180, conta1);

        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);
    }
}
