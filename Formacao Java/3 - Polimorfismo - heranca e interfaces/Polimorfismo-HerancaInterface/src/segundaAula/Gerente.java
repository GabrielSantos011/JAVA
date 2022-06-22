package segundaAula;

public class Gerente extends Funcionario {

    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //sobrescrita
    //temos a misma assinatura no método da classe mãe
    //geralmente usamos a notação @@Override na linha logo acima da assinatura
    //ela nos garante que a assinatura existe na classe mãe
    //sobre escrita é diferente de sobrecarga
    //na sobrecarga temos mesmo nome porém retorno ou parametros diferentes
    //com a sobrescrita podemos alterar o comportamento de um método para classe filha,
    //neste caso por exemplo um funcionário comum tem uma bonificação de 10%
    //mas para o nosso gerente queremos um salário + 10%
    //portanto sobrescrevemos este método, assim quando instanciarmos um funcionario
    //ele terá o método retornando 10% e quando instanciarmos um gerente ele terá
    //o método retornando um salario + 10%
    @Override
    public double getBonificacao() {
        //quando queremos acessar um atributo que está na classe usamos o this
        //mas no caso queremos algo que está na classe mãe então para isso usamos o super
        //o super serve para atributos e váriaveis mas nossos atributos são privados então não podemos
        //acessar, logo estamos utilizando os métodos públicos
        //uma outra solução poderia ser alterar a visibilidade do atributo para protected
        //que num geral significa público para classes filhas
        return super.getBonificacao() + super.getSalario();
    }

    public boolean autentica(String senha) {
        if (this.senha == senha)
            return true;

        return false;
    }

}
