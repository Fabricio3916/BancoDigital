package Contas;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Contas.Conta Corrente ===");
        imprimirInfosComuns();
    }

}