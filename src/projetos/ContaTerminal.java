package projetos;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args) {
        //TODO:Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner os valores digitados no terminal   

        //Exibir a mensagem conta criada 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é a " + agencia + ", conta " + conta + ", e seu saldo " + saldo + " já está disponivel para saque");
        
        scanner.close();
    }     
}
