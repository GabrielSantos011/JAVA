package terceiraAula;

public class Teste {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.deposita(100);
        conta1.agencia = 1111;
        conta1.numero = 1111;

        //como já dito na CriarConta da primeira aula o valor default de uma váriavel de referencia é null
        System.out.println(conta1.titular);

        //para acessarmos algo no objeto usamos o .
        //conta1.titular
        //porém, titular tb é um objeto então para acessar algo tb usamos .
        //conta1.titular.nome
        //mas como vimos ele está null, ou seja, sem referencia, e se tentarmos utilizar
        //tomaremos uma exception nullpointer
        //para podermos utilizar temos duas maneiras:

        Cliente cliente = new Cliente();

        conta1.titular = cliente;

        //ou jogando direto

        conta1.titular = new Cliente();

        //é també possivel na classe conta ao declarar o atributo titular colocar = new Cliente()
        //mas assim todas as contas instanciadas teriam um novo cliente e nem sempre isso faz sentido
        //por exemplo um cliente pode ter duas contas então n faz sentido a cada nova instancia
        //criar um novo cliente
    }
}
