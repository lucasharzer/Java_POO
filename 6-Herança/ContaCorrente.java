public class ContaCorrente{
    private double saldo;
    private int agencia;
    private int numeroConta;
    private String cliente;
    private String cpf;

    // método construtor
    public ContaCorrente(int agencia, int numeroConta, String cliente, String cpf){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    // consulta saldo
    public double consultaSaldo(){
        return this.saldo;
    }

    // depósito
    public double deposito(double valor){
        // não faz sentido depositar valor negativo
        if (valor > 0.0){
            this.saldo += valor;
        }else{
            System.out.println("Valor inválido para depósito!");
        }
        // depois de fazer o depósito mostramos o saldo atualizado
        return this.saldo; 
    }
    // saque
    public double saque(double valor){
        // não faz sentido sacar valor negativo
        if (valor > 0.0){
            // não podemos sacar o que não temos
            if (valor <= this.saldo){
                this.saldo -= valor;
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Valor inválido para saque!");
        }
        return this.saldo;
    }
    public double transferencia(double valor, ContaCorrente outraConta){
        // retirar o dinheiro da conta
        this.saque(valor);
        // e deposita na outra conta
        outraConta.deposito(valor);

        return this.saldo;
    }
}