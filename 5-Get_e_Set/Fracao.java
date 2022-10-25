public class Fracao {
    // Atributos: todos são privados!
    private int numerador;
    private int denominador;
    private double valor;

    // Métodos construtores
    public Fracao() {
        // Se nada for passado, fração = 1/1
        this(1,1);
    }

    public Fracao(int numerador) {
        // Só um valor passado: n/1
        this(numerador,  1);
    }

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.valor = (double)numerador/denominador;
    }

    // métodos get e set: todos públicos!
    public int getNumerador() {
        return this.numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        this.valor = (double)this.numerador/this.denominador;  // atualiza valor
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador != 0) {
              this.denominador = denominador;
              this.valor = (double)this.numerador / this.denominador;   // atualiza valor
        }   else   {
              System.out.println("ERRO: tentativa de denominador igual a zero!") ;
        }
    }

    public double getValor( ) {
        return this.valor;
    } 

    // Não faremos setValor: valor está em função de numerador e denominador!
    public void imprimeFracao( ) {
        System.out.println(this.numerador + "/" +this.denominador) ;
    }
}
