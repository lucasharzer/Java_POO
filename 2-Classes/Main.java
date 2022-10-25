public class Main {

    public static void main(String[] args) {
        // Criando dois objetos da classe Pessoa: p1 e p2
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // Acessamos os atributos (variáveis internas) utilizando ".":
        // NomeDoObjeto.NomeDoAtributo
        p1.nome = "Lucas";
        p1.idade = 20;
        p1.profissao = "Programador";

        p2.nome = "Jéssica";
        p2.idade = 20;
        p2.profissao = "Médica";

        // Invocamos os métodos de um objeto também usando ".":
        // nomeDoObjeto.nomeDoMetodo(parametros)
        p1.apresentar();
        p2.apresentar();
    }

}

// Para rodar:
// javac Main.java Pessoa.java
// java Main