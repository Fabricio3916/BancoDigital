public abstract class Conta implements IConta{

    protected  static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agencia: " + this.agencia );
        System.out.println("Numero: " + this.numero );
        System.out.println("Saldo: " + this.saldo);
    }

}


