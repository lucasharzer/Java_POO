// import java.util.*;


// public class Main {
//     public static void main(String args[]) {
//         double resultado = 0;

//         // Vamos executar linhas de código com possíveis problemas...
//         try{
//             resultado = fazDivisao();
//         }
//         // Tratando os erros...
//         catch(ArithmeticException e){
//             System.out.println("Você tentou dividir por zero!");
//             resultado = -1;
//         }
//         catch(InputMismatchException e){
//             System.out.println("Número inválido!");
//             resultado = -1;
//         }
//         // Já fizemos os tratamentos diferenciados nos catch...
//         // Agora vem o comum a todos:
//         finally{
//             System.out.println("O resultado da divisão foi: " + resultado);
//         }
//     }

//     // A função não irá tratar essas duas exceções.
//     // Ela irá jogar para ser tratada um nível acima.
//     public static double fazDivisao() throws InputMismatchException, ArithmeticException {
//         int numero1, numero2;
//         Scanner scan = new Scanner(System.in);

//         // Nas próximas linhas: risco de InputMismatchException
//         // Usuário pode digitar algo que não é int
//         System.out.println("Digite o numerador: ");
//         numero1 = scan.nextInt();
//         System.out.println("Digite o denominador: ");
//         numero2 = scan.nextInt();
//         scan.close();

//         // próxima linha: risco de ArithmeticException
//         // se o usuário fizer numero2 = 0
//         return (double)numero1/numero2;
//     }
// }


// Com o ValorNegativo
import java.util.*;


public class Main {
    public static void main(String args[]) {
        double resultado = 0;

        // Vamos executar linhas de código com possíveis problemas...
        try{
            resultado = fazDivisao();
        }
        // Tratando os erros...
        catch(ArithmeticException e){
            System.out.println("Você tentou dividir por zero!");
            resultado = -1;
        }
        catch(InputMismatchException e){
            System.out.println("Número inválido!");
            resultado = -1;
        }
        // Tratando nossa exceção personalizada:
        catch (ValorNegativo e){
            System.out.println("Valor negativo.");
        }
        // Já fizemos os tratamentos diferenciados nos catch...
        // Agora vem o comum a todos:
        finally{
            System.out.println("O resultado da divisão foi: " + resultado);
        }
    }

    // Nossa exceção personalizada é lançada pela função:
    public static double fazDivisao() throws InputMismatchException, ArithmeticException, ValorNegativo {
        int numero1, numero2;
        Scanner scan = new Scanner(System.in);

        // Nas próximas linhas: risco de InputMismatchException
        // Usuário pode digitar algo que não é int
        System.out.println("Digite o numerador: ");
        numero1 = scan.nextInt();
        System.out.println("Digite o denominador: ");
        numero2 = scan.nextInt();
        scan.close();
        // lançando nossa exceção personalizada
        if (numero1 < 0 || numero2 < 0){
            throw new ValorNegativo("Erro! Você não deveria digitar valores negativos!");
        }
        // próxima linha: risco de ArithmeticException
        // se o usuário fizer numero2 = 0
        return (double)numero1/numero2;
    }
}
