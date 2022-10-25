// public class Veterinario {
//     public String nome;
//     public int crmv;
//     public double preco;

//     public Veterinario(String nome, int crmv, double preco) {
//         this.nome = nome;
//         this.crmv = crmv;
//         this.preco = preco;
//     }

//     public void consulta(Pet paciente) {
//         System.out.println(this.nome + " examinou " + paciente.getNome());
//         System.out.println(paciente.getDono() + " deverá pagar R$" + this.preco);
//     }
// }


// Com a interface Cadastravel
public class Veterinario implements Cadastravel{
    public String nome;
    public int crmv;
    public double preco;

    public Veterinario(String nome, int crmv, double preco) {
        this.nome = nome;
        this.crmv = crmv;
        this.preco = preco;
    }

    public void consulta(Pet paciente) {
        System.out.println(this.nome + " examinou " + paciente.getNome());
        System.out.println(paciente.getDono() + " deverá pagar R$" + this.preco);
    }

    public void mostraFicha() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CRMV: " + this.crmv);
        System.out.println("Valor da consulta: " + this.preco);
    }
}

