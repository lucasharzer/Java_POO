class ContaESpecial extends ContaCorrente{

    private double limite;
    private double saldoDevedor;

    // método construtor
    public ContaEspecial(int agencia, int numeroConta, String cliente, String cpf, double limite){
        // invoca o construtor da classe mãe
        super(agencia, numeroConta, cliente, cpf);
        // realiza ações específicas de ContaEspecial:
        this.limite = limite;
    }

    // Sobreposição do saque
    public double saque(double valor) {
        double diferenca;
        // valor vai usar o limite?
        // então vamos mexer no saldo devedor
        if ((valor > this.consultaSaldo()) && (valor <= this.consultaSaldo() + (this.consultaLimite())))  {
            diferenca = valor - this.consultaSaldo();
            // usa o limite para tirar a diferença:
            this.saldoDevedor += diferenca;
            // atualiza o valor a ser sacado pelo saque normal:
            valor = this.consultaSaldo();
        }
        // chama o saque da conta corrente
        return super.saque(valor);
    }
    
    // consulta limite disponível
    public double consultaLimite(){
        if (this.consultaSaldo() >= 0.0){
            return this.limite;
        }else{
            return this.limite + this.consultaSaldo();
        }
    }
}