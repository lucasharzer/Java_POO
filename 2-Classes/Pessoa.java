// Define a classe Pessoa

public class Pessoa {
    // Definindo os atributos
    String nome;
    int idade;
    String profissao;

    // Criando um método
    void apresentar() {
        /*this.nome irá acessar o atributo do objeto que invocou o método apresentar. Idem para this.idade e this.profissao */
        System.out.println("Olá, eu sou " + this.nome + ", tenho " + this.idade + " anos e sou " + this.profissao);
    }

}

