package segundaAula;

public class EntendendoExcecao1 {

    //será colocada um código que causará uma exceção no metodo2()
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
            //aqui será colocado um código que causará uma excecao
            int a = 2/0;
            //não há divisão por zero então o java joga uma exececao na pilha (stack) -
            //as excecoes no java tem nome diferente de algumas linguagens que tem códigos,
            //neste caso será jogada uma java.lang.ArithmeticException: / by zero -
            //a partir do momento em que a excecao é jogada o java começa um procedimento:
            //há um código dentro do método atual (metodo2()) que trata a excecao?
            // caso haja ele usa este códigoe da prosseguimento a execucao do método
            // caso contrário ele encerra o método e tira o mesmo da pilha de execução (mesmo que ainda
            // não tenha acabado 100% de sua execução)
            //e vai fazendo o mesmo até encontrar algum código que trate nos outros métodos ou não haver mais
            //métodos na pilha de execução, neste caso ele irá para o metodo1() e não achará nada,
            //irá para o main() e tambem não encontrará nada
            //quando chega no main e não encontra um tratamento para continuar executando o método ele joga
            //"o ratro" (stacktrace) no console, mostrando o erro e por onde ele passou, no caso:
//            Exception in thread "main" java.lang.ArithmeticException: / by zero
    //            at segundaAula.EntendendoExcecao1.metodo2(EntendendoExcecao1.java:24)
    //            at segundaAula.EntendendoExcecao1.metodo1(EntendendoExcecao1.java:14)
    //            at segundaAula.EntendendoExcecao1.main(EntendendoExcecao1.java:8)
        }

        System.out.println("fim do método2");
    }
}
