package quartasemana.projetobanco;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void tranferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
