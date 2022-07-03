package setimaAula;

//esta classe será utilizada para reutilização de código
//das classes que implementam a interface autenticavel
//por meio da composição,
//logo implementaremos os métodos aqui
public class AutenticacaoUtil implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

}
