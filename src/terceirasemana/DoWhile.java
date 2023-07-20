package terceirasemana;

import java.util.Random;

public class DoWhile {
    //Joãozinho resolveu ligar para o seu amigo,
    //dizendo que hoje se entupiu de comer docinhos.
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô");

    }
    private static boolean tocando (){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?" + atendeu);
        return ! atendeu; 
    }
    
    

    
    
}
