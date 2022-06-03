package primeiraAula;
//ignorar package por enqunto

/*
Uma classe é como uma planta de uma casa, ou seja, ela define tudo que
a casa terá, mas Não é uma casa. As clsses seguem essa lógica, elas são moldes de
algo que é chamado de objeto ----- elas são um tipo

No exemplo do curso vamos criar uma conta, ea conta tem alguns ATRIBUTOS
como saldo, agencia, numero da conta, titular.

Atributos são oque (no caso) a conta tem.

e temos também os MÉTODOS, que é o que a conta faz, como por exemplo
sacar, depositar, entre outros

os atributos não ficam dentro de métodos, se não seriam variáveis

Esta classe compila normalmente, mas não conseguimos executar.
Para executarmos um código precisamos de uma classe que tenha o método main
 */
public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
}
