package segundaAula;

public class EntendendoExcecao2 {

    //tratamento de excecoes no método2()
    public static void main(String[] args) {
        System.out.println("Início do método main");
        metodo1();
        System.out.println("fim do método main");
    }

    public static void metodo1() {
        System.out.println("Início do método1");
        metodo2();
        System.out.println("fim do método1");
    }

    public static void metodo2() {
        System.out.println("Início do método2");
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
            //para tratar usamos um try{}catch{}
            //ou seja, "java, tenta executar esse código, caso de uma excecao
            //vc captura ela (catch) e faz tal coisa (trata)"
            try{
                int a = 2/0;
            } catch (ArithmeticException ex) {
                System.out.println("ocorreu uma ArithmeticException");
                //a excecao é uma classe, mais a frente iremos aprender a criar nossas proprias excecoes
                //mas por hora sabemos então que ex é uma referencia e podemos utiliza-lá
                //ex.printStackTrace();
                //ex.getMessage();
            }
            //repare que agora, ao executar, o método2() não é mais encerrado abruptamente
            //cada vez que uma ArithmeticException ocorre ele entra no catch e executa o
            //nosso código de tratamento (que no caso é apenas uma mensagem) e segue normalmente
            //sua rotina
            //importante notar que esse tratamento poderia ser feito na chamada do metodo2() por ex
            //ou até mesmo na chamada do metodo1()
            //no caso de:
//            try{
//                metodo1();
//            } catch (ArithmeticException ex) {
//                System.out.println("ocorreu uma ArithmeticException");
//            }
            //o metodo2() n tem tratamento e volta a ser bruptamente encerrado, porém o metodo1()
            //trata e segue sua rotina normalmente

            //obs: nosso catch só está tratando ArithmeticException para tratar outras excecoes
            //ou acrescentamos outro catch, ou colocamos mais de uma excecao
            //catch (ArithmeticException | NullPointerException ex)
            //ou até mesmo utilizamos do polimorfismo por meio da Excepition
            //catch (Exception ex)
        }
        System.out.println("fim do método2");
    }
}
