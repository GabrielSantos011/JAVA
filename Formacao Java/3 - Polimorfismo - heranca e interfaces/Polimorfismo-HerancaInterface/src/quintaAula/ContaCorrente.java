package quintaAula;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	//método saca obrigatório em classe filha concreta
	@Override
	public boolean saca(double valor) {
		double taxa = 0.5;
		if(this.saldo >= valor + taxa) {
			this.saldo -= (valor + taxa);
			return true;
		} else {
			return false;
		}
	}

}
