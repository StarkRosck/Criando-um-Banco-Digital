public class BancoDigital {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Arthur");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(1000);
        cc.transferir(200, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
