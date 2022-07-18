package quintaAula.parteDois;


public class TesteTryWithResources {

    public static void main(String[] args) {

        //try with resources
        //a classe conexao tem que implementar AutoCloseable
        //ele já faz um finally com o método close
        //e verifica se não deu erro na instancia, tudo automaticamente
        //evitando validações amais com if por exemplo
        try(Conexao con = new Conexao()){
            con.leDados();
        } catch (Exception e) {
            System.out.println("Deu um erro");
        }
    }

}
