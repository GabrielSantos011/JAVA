package setimaAula;

//administrador é um funcionario e assina o contrato autenticavel
//Administrador faz a reutilização do código por meio do AutenticadorUtil
public class Administrador extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;

    public Administrador() {
        //aqui é feita a composição
        //ou seja, o Administrador tem um AutenticacaoUtil
        //e o ciclo de vida deste autenticador é o mesmo do administrador,
        //eles nascem juntos e morrem juntos
        //o autenticador pertence ao administrador
        //com isso chegamos a uma conclusão
        //polimorfismo - interface
        //reutilização de código - composição
        //os dois - herança
        this.autenticador = new AutenticacaoUtil();
    }
	
	@Override
	public double getBonificacao() {
		return 50;
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
