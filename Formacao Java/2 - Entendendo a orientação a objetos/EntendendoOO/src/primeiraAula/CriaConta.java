package primeiraAula;

public class CriaConta {
    public static void main(String[] args) {
        //instanciar um objeto é fazer a planta da casa se transformar em uma casa
        //fazemos isso no java com o new NomeClasse()
        //criaremos uma variável do tipo conta
        Conta primeiraConta = new Conta();

        //agora primeiraConta é uma conta de verdade, dela podemos colocar valores em seus atributos
        //utilizar seus métodos e tudo mais.

        //é importante frisar que temos a classe, temos o objeto e temos a referência
        //classe e objetos já falamos, a referência é que a variável primeiraConta
        //não é como uma variavel de tipo primitivo que guarda o valor, ela guarda uma referencia
        //de onde está o objeto, como se fosse uma posição de memória, podemos observar isso com um
        //System.out.println()
        System.out.println(primeiraConta);

        //acessar um campo da primeiraConta
        //diferente de uma variável de tipo primitivo que não tem valor default
        //quando instanciamos um objeto seus atrubutos tem valores default, por ex
        System.out.println(primeiraConta.agencia);

        //porém quando esse atributo for uma outra classe, um outro objeto esse valor default é null
        //porque este atributo não está referenciando nenhum objeto, e devemos tomar cuidado com isso, pois
        //se tentarmos acessar algum atributo ou método enquanto ele não referenciar nada dará uma exception
        //de nullpointer
        System.out.println(primeiraConta.titular);

        primeiraConta.agencia = 1122;
        primeiraConta.numero = 12345;
        primeiraConta.titular = "Gabriel";
        primeiraConta.saldo = 200.57;

        //podemos ter quantos objetos quisermos e um objeto não interfere no outro
        Conta segundaConta = new Conta();

        segundaConta.agencia = 3344;
        segundaConta.numero = 56789;
        segundaConta.titular = "José";
        segundaConta.saldo = 50;

        System.out.println("A conta do " + primeiraConta.titular +
                " tem um saldo de " + primeiraConta.saldo);

        System.out.println("A conta do " + segundaConta.titular +
                " tem um saldo de " + segundaConta.saldo);

        //testando as referencias
        //preste atenção neste caso
        primeiraConta = segundaConta;
        //aqui não é gerado um clone da segunda conta para a primeira
        //a variavel segunda conta guarda uma referencia e está passando ela para
        //a variável primeiraConta e isso implica em duas variáveis de referência apontando
        //para o mesmo objeto e caso eu faça uma alteração do tipo
        primeiraConta.saldo = 0;
        //isso implica que a segunda conta tb ficou com 0 no saldo pois se trata do
        //mesmo objeto
        System.out.println(segundaConta.saldo);

        //isso nos mostra que devemos tomar cuidado com relação as referencias e fora isso nos mostra
        //que se fizermos um primeiraConta == segundaConta ele vai comparar as referencias e não os objetos
        //se fizermos isso agora ele daria true pois eles estão apontando para o mesmo lugar
        //mas pode haver um caso onde temos duas referencias diferentes de conta porém os dois objetos
        //tem os mesmos valores em seus atributos, se fizermos uma comparação com == ela retornará false
        //pois as referencias seriam diferentes
    }
}
