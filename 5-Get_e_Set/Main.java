public class Main {
    
    public static void main(String[] args) {
        Fracao frac1 = new Fracao(); // fração 1/1
        Fracao frac2 = new Fracao(2);// fracao 2/1
        Fracao frac32 = new Fracao(3,2);// fracao 3/2

        // Visualizando as 3 frações
        frac1.imprimeFracao();
        frac2.imprimeFracao();
        frac32.imprimeFracao();

        // Usando os gets na fração 3/2:
        System.out.println("Numerador de 3/2: " + frac32.getNumerador());
        System.out.println("Denominador de 3/2: " + frac32.getDenominador());
        System.out.println("Valor de 3/2: "+ frac32.getValor());

        // Mudando 3/2 para 5/2:
        frac32.setNumerador(5);
        frac32.imprimeFracao();

        System.out.println("Valor de 3/2: " + frac32.getValor());

        // Tentando mudar 5/2 para 5/0:

        frac32.setDenominador(0);
        frac32.imprimeFracao();
    }
}
