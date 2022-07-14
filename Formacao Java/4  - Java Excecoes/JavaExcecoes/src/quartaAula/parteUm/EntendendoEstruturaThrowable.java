package quartaAula.parteUm;

public class EntendendoEstruturaThrowable  {

    /*
    * Na aula anterior aprendemos a utilizar o throw, porém não conseguimos jogar uma "classe comum"
    * apenas classes que extendem Throwable.
    * Throwable é a classe base para Exception e Error
    * Error não é uma classe de muito conhecimento dos programadores java, ela é mais interna,
    * para a máquina virtual. (simulacao de error em SimulaErro.java)
    * já Exception é de conhecimento, e ela é classe base para RuntimeException
    *
    * Exception x RuntimeException
    * a diferença está na maneira em que o compilador lida com cada uma
    * RuntimeException é unchecked, ou seja, o compilador não fica de olho nela
    * logo podemos dar um throw a vontade.
    * Já Exception é checked, então o compilador fica de olho e caso de um throw
    * o código não compila até que haja um tratamento ou um throws na assinatura do método
    * (indicando assim que estamos cientes que esá passando uma excecao ali)
    * (package parteDoisCriandoExcecoes exemplificará isso)
    */

}
