package quartaAula.parteDoisCriandoExcecoes;

public class TesteChecked {

    //poderiamos colocar throws na assinatura do main também, poré não é necessário
    //pois fizemos o tratamento
    public static void main(String[] args) {
        System.out.println("Início do método main");
        try {
            metodo1();
        } catch(ExcecaoChecked ex) {
            System.out.println("ExcecaoChecked tratada");
        }

        System.out.println("fim do método main");
    }

    //o compilador percebe que o método2() tem um throws e não compila a menos que haja um tratamento
    //ou um throws na assinatura novamente
    public static void metodo1() throws ExcecaoChecked {
        System.out.println("Início do método1");
        metodo2();
        System.out.println("fim do método1");
    }

    //como não ouve tratamento somos obrigados a colocar na assinatura do método que estamos ciente que há
    //uma excecção no método
    public static void metodo2() throws ExcecaoChecked {
        System.out.println("Início do método2");

        throw new ExcecaoChecked("teste excecao checked");
    }

}
