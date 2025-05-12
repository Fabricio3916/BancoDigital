package Contas;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Contas.Conta Poupança ===");
        imprimirInfosComuns();
    }
}

