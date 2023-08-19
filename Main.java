public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("João", "123456789");
        Cliente cliente2 = new Cliente("Maria", "987654321");

        Conta conta1 = new ContaCorrente("001", cliente1, 500.0);
        Conta conta2 = new ContaPoupanca("002", cliente2, 0.02);

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Realize operações nas contas e utilize métodos do banco conforme necessário
    }
}
