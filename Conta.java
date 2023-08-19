public abstract class Conta implements IConta {
    protected String numero;
    protected Cliente titular;
    protected double saldo;

    public Conta(String numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Implementação dos métodos da interface IConta
}
