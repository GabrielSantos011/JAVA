public class CondicionalIf {
    public static void main(String[] args) {
        int idade = 18;

        //==  <  <=  >  >=
        //&& (and)  || (or)
        if ( idade > 18 ) {
            //obs: no java, em geral uma variavel tem escopo de uma abertura chave
            //até seu fechamento {}, ou seja, se eu criar uma variável dentro do
            //if ela só pode ser acessada aqui dentro
            System.out.println("Você pode dirigir e votar");
        } else if (idade > 16) {
            System.out.println("Você só pode votar");
        } else {
            System.out.println("Você não pode nada");
        }
    }
}
