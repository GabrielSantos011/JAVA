package primeiraAula;

//herança - classe mãe
//A orientação a objetos veio para evitar a repetição de código e centralização do mesmo em um lugar
//ao criarmos um funcionário por exemplo, não é viavel ter um campo tipo do funcionario
//e embora o ideal seja ter uma classe para cada tipo, todos os tipos de funcionário tem nome, cpf e salario
//então repetir código não é uma boa ideia, logo temos uma classe mais genérica, na qual as classes possam
//utiilizar como base, é a chamada classe mãe
public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao() {
        return this.salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
