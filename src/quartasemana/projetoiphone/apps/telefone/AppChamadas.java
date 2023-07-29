package quartasemana.projetoiphone.apps.telefone;

public class AppChamadas implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("Ligando");
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
}
