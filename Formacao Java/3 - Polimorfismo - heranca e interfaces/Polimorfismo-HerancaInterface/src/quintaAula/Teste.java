package quintaAula;

public class Teste {

    public static void main(String[] args) {
        //não compila mais pois a classe conta é abstrata
        //Conta conta = new Conta(11111, 222222);

        //polimorfismo ainda funciona
        Conta cc = new ContaCorrente(1111,1111);
        Conta cp = new ContaPoupanca(2222,22222);

        cc.deposita(1000000);
        cp.deposita(1000000);

        cc.saca(1);
        cp.saca(1);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }

}
