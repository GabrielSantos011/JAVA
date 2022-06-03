public class LacosDeRepeticao {
    public static void main(String[] args) {
        int contador = 0;

        //while
        while (contador < 10) {
            System.out.println(contador);
            contador = contador + 1;
            //outra maneira
            //contador += 1
            //contador++
        }

        contador = 0;

        do {
            System.out.println(contador);
            contador--;
        } while (contador > 0);
        //repare que contador é igual a 0 e não entraria na condição se fosse um while
        //comum, mas estamos fazendo um do...while, então ele primeiro faz e depois verifica se continua

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //obs: break e continue
        //podem ser usados nos laços
        //o break finaliza o laço mais interno, não importa se é um for de 1 a 10 e
        //ainda está no primeiro, ele vai parar esse laço imediatamente
        //ja o continue vai deixar de executar o que está abaixo dele
        //mas vai para a próxima iteração 
    }
}
