package segundaAula;

public class Teste {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setCpf("99999999999");
        f1.setNome("Gabriel");
        f1.setSalario(1000.0);

        System.out.println(f1.getNome());
        System.out.println(f1.getCpf());
        System.out.println(f1.getSalario());
        System.out.println(f1.getBonificacao());

        System.out.println("------------------------------------------------------");

        Gerente g1 = new Gerente();
        g1.setCpf("99999999999");
        g1.setNome("José");
        g1.setSalario(5000.0);
        g1.setSenha("123");

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.autentica("0987654"));
        System.out.println(g1.autentica("123"));
        System.out.println(g1.getBonificacao());
    }

}
