package quartasemana.pilarespoo.projetocarro;

public class Autodromo {    
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("0310199");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("1404199");
        z400.ligar();

        //aproveitamento, reutilização de código
        Veiculo coringa = jeep;
        coringa.ligar();
    }
    
}
