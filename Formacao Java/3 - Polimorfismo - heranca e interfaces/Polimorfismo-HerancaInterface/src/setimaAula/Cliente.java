package setimaAula;

//cliente assina o contrato autenticavel
//Cliente faz a reutilização do código por meio do AutenticadorUtil
public class Cliente implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Cliente() {
        //aqui é feita a composição
        //ou seja, o Cliente tem um AutenticacaoUtil
        //e o ciclo de vida deste autenticador é o mesmo do cliente,
        //eles nascem juntos e morrem juntos
        //o autenticador pertence ao cliente
        //com isso chegamos a uma conclusão
        //polimorfismo - interface
        //reutilização de código - composição
        //os dois - herança
        this.autenticador = new AutenticacaoUtil();
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
