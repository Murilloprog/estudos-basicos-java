package quartasemana.projetobanco;

public class Main {
    public static void main(String[] args) {
        Cliente murillo = new Cliente();
        murillo.setNome("Murillo");
        
        Conta cc = new ContaCorrente(murillo); 
        cc.depositar(100);

        Conta cp = new ContaPoupanca(murillo); 
        cp.depositar(200);

        cc.tranferir(cp, 50);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
    
}
