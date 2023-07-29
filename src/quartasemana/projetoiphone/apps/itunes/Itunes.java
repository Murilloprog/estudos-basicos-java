package quartasemana.projetoiphone.apps.itunes;

public class Itunes implements ReprodutorMusical {

    public void selecionarMusica() {
    System.out.println("Musica selecionada no Itunes");
    }
    public void tocar() {
        System.out.println("Tocando Musica no Itunes");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica no Itunes");
    }
    
}
