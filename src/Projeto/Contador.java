package projeto;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int primeiroParametro = scanner.nextInt(); 

        System.out.println("Digite o segundo valor");
        int segundoParametro = scanner.nextInt(); 
        
        try {
            contar (primeiroParametro, segundoParametro);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("O segundo parametro deve ser maior que o primeiro parametro");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if(primeiroParametro > segundoParametro)
        throw new ParametrosInvalidosException(); 

        int contagem = segundoParametro - primeiroParametro; 

        for (int parametro = 1; parametro <= contagem; parametro++){
            System.out.println("Parametro " + parametro);
        }

    }
}