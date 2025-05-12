public class Main {
    public static void main(String[] args) {
        Cliente fabricio = new Cliente();
        fabricio.setNome("Fabricio Passos");

        Conta cc = new ContaCorrente(fabricio);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(fabricio);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
