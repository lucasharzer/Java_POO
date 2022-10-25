public class Main {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1234, 142536, "João", "135.792.468-00");
        ContaCorrente conta2 = new ContaCorrente(1234, 192837, "Maria", "864.297.531-00");

        double saldoAtual;

        saldoAtual = conta1.deposito(5000.0);
        System.out.println("João possui " + saldoAtual + " após o depósito de 5000");

        saldoAtual = conta2.saque(1000.0);
        System.out.println("Maria possui " + saldoAtual + " após o saque de 1000");

        saldoAtual = conta1.transferencia(2500.0, conta2);
        System.out.println("João possui " + saldoAtual + " após transferir 2500");

        saldoAtual = conta2.consultaSaldo();
        System.out.println("Maria ficou com " + saldoAtual);

        saldoAtual = conta1.saque(2550.0);
        System.out.println("João tentou sacar e ficou com " + saldoAtual);
    }
}
