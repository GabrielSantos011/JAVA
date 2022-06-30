package quintaAula;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	//método saca obrigatório em classe filha concreta
	@Override
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= (valor);
			return true;
		} else {
			return false;
		}
	}

}
