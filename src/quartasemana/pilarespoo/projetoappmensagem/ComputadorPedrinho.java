package quartasemana.pilarespoo.projetoappmensagem;

import quartasemana.pilarespoo.projetoappmensagem.apps.FacebookMessenger;
import quartasemana.pilarespoo.projetoappmensagem.apps.MSNMessenger;
import quartasemana.pilarespoo.projetoappmensagem.apps.ServicoMensagemInstantanea;
import quartasemana.pilarespoo.projetoappmensagem.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
		
		
		/*//abrindo MSN Messenger
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

		System.out.println("FACE");
        FacebookMessenger face = new FacebookMessenger();
		face.enviarMensagem();
		face.receberMensagem();

		System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();*/
	}
}
