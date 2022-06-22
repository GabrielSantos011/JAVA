package primeiraAula;

//herança - classe filha
//Gerente também deve ter todos os atributos que Funcionario tem, além deles ele tem uma senha
//e um método de autenticação dessa senha
//para isso precisamos dizer que gerente é um funcionario ou que gerente herda de funcionario
public class Gerente extends Funcionario {

    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentica(String senha) {
        if (this.senha == senha)
            return true;

        return false;
    }

}
