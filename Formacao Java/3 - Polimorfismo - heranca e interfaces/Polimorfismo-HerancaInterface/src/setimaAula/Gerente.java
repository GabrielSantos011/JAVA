package setimaAula;

//Gerente é um Funcionario e assina o contrato Autenticavel
//Gerente faz a reutilização do código por meio do AutenticadorUtil
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente() {
        //aqui é feita a composição
        //ou seja, o Gerente tem um AutenticacaoUtil
        //e o ciclo de vida deste autenticador é o mesmo do gerente,
        //eles nascem juntos e morrem juntos
        //o autenticador pertence ao gerente
        //com isso chegamos a uma conclusão
        //polimorfismo - interface
        //reutilização de código - composição
        //os dois - herança
        this.autenticador = new AutenticacaoUtil();
    }

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

}
