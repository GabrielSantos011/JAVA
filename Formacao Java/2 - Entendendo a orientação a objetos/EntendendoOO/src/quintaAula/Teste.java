package quintaAula;

public class Teste {
    public static void main(String[] args) {
        //agora ao instanciar a classe devemos passar os parametros do construtor
        //pq ao criarmos um construtor o java deixa de nos fornecer o padrão
        //(nada nos impede de criar um outro construtor sem passagem de parametros)
        Conta conta = new Conta(1111, 1212121);
        Conta conta1 = new Conta(1111, 1212121);
        Conta conta2 = new Conta(1111, 1212121);
        Conta conta3 = new Conta(1111, 1212121);

        //acessar método estático
        System.out.println(Conta.getTotal());
    }
}
