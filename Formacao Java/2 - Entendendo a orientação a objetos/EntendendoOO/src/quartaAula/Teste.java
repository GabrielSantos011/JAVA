package quartaAula;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta();

        //conta.saldo não funciona mais
        conta.deposita(100);
        System.out.println(conta.getSaldo());

        conta.setAgencia(1111);
        conta.setNumero(11111);

        conta.setTitular(new Cliente());
        conta.getTitular().setNome("Gabriel");
    }
}
