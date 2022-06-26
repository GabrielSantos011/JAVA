package terceiraAula;

public class Teste {

    public static void main(String[] args) {
        //testando o polimorfismo, explicação na classe SomaTotalBonificacao
        SomaTotalBonificacao s = new SomaTotalBonificacao();

        Funcionario f = new Funcionario();
        f.setNome("aaaaa");
        f.setCpf("11111111");
        f.setSalario(1000.0);

        Gerente g = new Gerente();
        g.setNome("bbbbb");
        g.setCpf("222222");
        g.setSalario(5000.0);

        s.registra(f);
        s.registra(g);

        System.out.println(s.getTotal());
    }

}