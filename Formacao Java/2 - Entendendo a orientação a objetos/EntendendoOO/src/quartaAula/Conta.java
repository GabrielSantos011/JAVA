package quartaAula;

public class Conta {
    //da maneira que utilizavamos até a aula anterior era possível acessarmos o atributo "na unha"
    //nós temos um método para que a pessoa deposite e saque o dinheiro, mas alguém poderia pegar
    //e alterar o valor do saldo na mão (conta.saldo = x), poderia colocar um valor negativo e por ai vai
    //portanto devemos encapsular os atributos
    //para que isso não aconteça colocamos o private
    //private é um modificador de acesso e ele faz com que somente essa classe tenha acesso
    //logo em outra classe não conseguiremos mais utilizar os atributos diretamente
    //para isso temos os métodos get e set (não são obrigatórios para todos os casos)
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    public void deposita(double valor) {
        if ( valor > 0 )
            this.saldo += valor;
    }

    public boolean saca(double valor){
        if ( valor <= this.saldo && valor > 0 ) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        if ( valor <= this.saldo && valor > 0 ) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
