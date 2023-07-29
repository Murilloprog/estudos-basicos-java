package quartasemana.projetoiphone.iphone;

import quartasemana.projetoiphone.apps.itunes.ReprodutorMusical;
import quartasemana.projetoiphone.apps.telefone.AparelhoTelefonico;
import quartasemana.projetoiphone.apps.web.NavegadorInternet;

public class IphoneMultifuncional implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina pelo iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo iphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Alualizando pagina pelo iphone");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Play na musica pelo iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação pelo iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo iphone");
        }
        
    
}
