package quartaAula.parteDoisCriandoExcecoes;

public class ExcecaoUnchecked extends RuntimeException {

    //construtor padrão
    public ExcecaoUnchecked(){}

    //construtor passando mensagem da excecao
    public ExcecaoUnchecked(String msg){
        super(msg);
    }

}
