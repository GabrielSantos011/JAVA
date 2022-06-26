package terceiraAula;

public class Gerente extends Funcionario {

    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }

    public boolean autentica(String senha) {
        if (this.senha == senha)
            return true;

        return false;
    }

}
