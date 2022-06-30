package quintaAula;

//classe abstrata
//a classe conta trata sobre um conceito conta
//porém não deveríamos conseguir instancia-lá
//pq na pratica não existe "só uma conta", mas sim
//uma conta corrente ou uma conta poupança
//para tal tornamos essa classe abstrata
//continuamos utilizando normalmente toda a questão do polimorfismo
//abstract está diretamente ligada a herança
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    //além da classe podemos ter métodos abstratos
    //digamos que para cada tipo de conta exista uma taxa de saque diferente
    //então é um método especifico do tipo da conta
    //tecnicamente ele não deveria estar aqui na classe mais genérica,
    //porém queremos garantir que ele será implementado nas classes filhas
    //pq toda conta tem que ter o método saca
    //logo colocamos um método abstrato aqui, ou seja, um método sem corpo
    //com ele as classes filhas concretas (que não sao abstratas) são
    //obrigadas a implementar
    //obs - caso a classe possua um método abstrato ela é obrigada a ser abstrata
    public abstract boolean saca(double valor);

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
        		destino.deposita(valor);
        		return true;
        } else {
        		return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}