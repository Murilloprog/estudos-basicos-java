package terceirasemana;

public class CondicionalSimples {
    public static void main(String[] args) {
        // Validação de execução de fluxo somente quando a condição for simples
        // CaixaEletronico.java

       double saldo = 25.0;
       double valorSolicitado = 15.0; // Testado tambem com valor acima de 25, o que permanece o mesmo saldo devido nao entrar no fluxo if

       if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
       }
    }
}
    