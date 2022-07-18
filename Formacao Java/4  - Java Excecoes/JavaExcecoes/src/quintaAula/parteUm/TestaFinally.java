package quintaAula.parteUm;

public class TestaFinally {

    public static void main(String[] args) {
        //vamos aprender sobre o finally
        //ao abrirmos uma conexao, por exemplo, sempre devemos fecha-la
        //porém essa conexao pode dar um erro. Para garantir que a conexao fosse
        //fechada teriamos que fechar dentro de um try e tb fechar dentro do catch
        //garantindo assim que a conexao fosse fechada caso desse tudo certo
        //ou se ocorresse algum erro
        //para evitar essa repetição foi criado o finally.
        //O que estiver nele acontecerá, independente de try ou catch
        //obs: embora o try possa ser seguido de um catch e depois um finally
        //     só obrigatório o uso de algum deles

        Conexao con = new Conexao();

        try {
            con.leDados();
        } catch (Exception e) {
            System.out.println("Deu um erro");
        } finally {
            con.fecha();
        }
    }

}
