package quartasemana.pilarespoo.projetoappmensagem.apps;

public class Telegram extends ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
		}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
		salvarHistoricoMensagem();
		}



	/*public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}*/


}