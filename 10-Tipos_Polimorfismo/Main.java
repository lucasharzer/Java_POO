public class Main {
    public static void main(String[] args){
        /*
            Polimorfismo estático:
            - em um dos casos, invocamos o método com um parâmetro
            - no outro caso, invocamos o método sem parâmetro
            Na compilação, através dos parâmetros passados,
            o Java já identifica qual versão usar!
        */

        Programador maria = new Programador("Maria");
        Programador anon = new Programador();
        ProgramadorJava jose = new ProgramadorJava("José");

        /*
            O método "testes" (definido abaixo) recebe 1 objeto
            Programador como parâmetro.
            Portanto, podemos passar maria e anon...
        */

        testes(maria);
        testes(anon);
        //... ou jose, que é de uma classe filha de Programador!
        testes(jose);
    }

    public static void testes(Programador p){
        System.out.println("Agora " + p.getNome() + " está se preparando para rodar seus testes...");

        /*
            Polimorfismo dinâmico:
            p é um objeto Programador...
            ...ou objeto de classe filha.
            No ato da implementação da função sabemos qual o caso?
            Não, até porque podem ser ambos (vide na main).
            Portanto, em tempo de execução o Java decidirá
            qual "testaCodigo()" será invocado cada vez que
            esse trecho do código for executado. O resultado
            dependerá do objeto passado!
        */

        p.testaCodigo();
    }
}
