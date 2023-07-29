package quartasemana.projetoiphone.usuario;

import quartasemana.projetoiphone.apps.itunes.ReprodutorMusical;
import quartasemana.projetoiphone.apps.telefone.AparelhoTelefonico;
import quartasemana.projetoiphone.apps.web.NavegadorInternet;
import quartasemana.projetoiphone.iphone.IphoneMultifuncional;

public class Murillo {
    public static void main(String[] args) {
        IphoneMultifuncional iphone = new IphoneMultifuncional();

        ReprodutorMusical itunes = iphone;
        NavegadorInternet web = iphone; 
        AparelhoTelefonico tel = iphone;

        itunes.tocar();
        web.adicionarNovaAba();
        tel.atender();
        

    }
}
