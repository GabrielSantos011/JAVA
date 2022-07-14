package quartaAula.parteDoisCriandoExcecoes;

public class ExcecaoChecked extends Exception {

    //construtor padrão
    public ExcecaoChecked(){}

    //construtor passando mensagem da excecao
    public ExcecaoChecked(String msg){
        super(msg);
    }

}
