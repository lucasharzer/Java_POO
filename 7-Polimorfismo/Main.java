// public class Main {

//     public static void main(String[] args) {
//         ContaEspecial conta1 = new ContaEspecial(1234, 142536, "João", "135.792.468-00", 1000.0);
//         ContaCorrente conta2 = new ContaCorrente(1234, 192837, "Maria", "864.297.531-00");
//         double saldoAtual;

//         saldoAtual = conta1.deposito(5000.0);
//         System.out.println("João possui " + saldoAtual + " após o depósito de 5000");

//         saldoAtual = conta2.saque(10000.0);
//         System.out.println("Maria possui " + saldoAtual + " após o saque de 10000");

//         saldoAtual = conta2.saque(1000.0);
//         System.out.println("Maria possui " + saldoAtual + " após o saque de 1000");

//         saldoAtual = conta1.transferencia(2500.0, conta2);
//         System.out.println("João possui " + saldoAtual + " após transferir 2500");
        
//         saldoAtual = conta2.consultaSaldo();
//         System.out.println("Maria ficou com " + saldoAtual);

//         saldoAtual = conta1.saque(2550.0);
//         System.out.println("João tentou sacar e ficou com " + saldoAtual);
//         System.out.println("Limite disponível para João: " + conta1.consultaLimite());
//     }
// }

// instanceof -> verificar se um objeto pertence a uma certqa classe
public class Main {

    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(1234, 142536, "João", "135.792.468-00", 1000.0);
        ContaCorrente conta2 = new ContaCorrente(1234, 192837, "Maria", "864.297.531-00");
        double saldoAtual;

        if (conta1 instanceof ContaEspecial) {
            System.out.println("conta1 é ContaEspecial");
        }else{
            System.out.println("conta1 NÃO é ContaEspecial");
        }

        if (conta1 instanceof ContaCorrente) {
            System.out.println("conta1 é ContaCorrente");
        }else{
            System.out.println("conta1 NÃO é ContaCorrente");
        }



        if (conta2 instanceof ContaEspecial) {
            System.out.println("conta2 é ContaEspecial");
        }else{
            System.out.println("conta2 NÃO é ContaEspecial");
        }

        if (conta2 instanceof ContaCorrente) {
            System.out.println("conta2 é ContaCorrente");
        }else{
            System.out.println("conta2 NÃO é ContaCorrente");
        }
    }
}
