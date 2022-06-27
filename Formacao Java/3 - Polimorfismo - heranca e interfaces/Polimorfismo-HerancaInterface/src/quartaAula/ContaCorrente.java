package quartaAula;

public class ContaCorrente extends Conta {

	//Os construtores não são heradados
	//caso a classe mãe utilize o construtor padrão o java já
	//coloca implicitamente, mas no nosso caso a conta exige
	//uma agencia e um numero então passamos esses parametros
	//através do super();
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
}
