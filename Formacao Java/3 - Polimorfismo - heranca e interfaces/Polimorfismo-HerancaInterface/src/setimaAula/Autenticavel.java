package setimaAula;

//interfaces nos ajudam com polimorfismo

//através desta interface autenticavel conseguimos
//tratar com gerentes, administradores e clientes
//porém, podemos perceber que todas estas classes
//utilizam o mesmo código para os métodos desta interface
//Replicar código nunca é uma boa ideia
//herança vai nos ajudar com reulitização de código e polimorfismo,
//mas interfaces não, elas nos ajudam apenas com o polimorfismo,
//porém há uma solução só para reutilização de código - a composição
//para isso criamos a AutencicacaoUtil
public interface Autenticavel {
	void setSenha(int senha);

	boolean autentica(int senha);
}
