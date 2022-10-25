// public class Pet {
//     private String nome;
//     private String dono;
//     private String cor;
//     private String raca;

//     public Pet(String nome, String dono, String cor, String raca){
//         this.nome = nome;
//         this.dono = dono;
//         this.cor = cor;
//         this.raca = raca;
//     }

//     public String getNome(){
//         return this.nome;
//     }

//     public void fala(){
//         System.out.println(this.nome + " faz barulhos.");
//     }
// }

// Abstração
public abstract class Pet{
    private String nome;
    private String dono;
    private String cor;
    private String raca;

    public Pet(String nome, String dono, String cor, String raca){
        this.nome = nome;
        this.dono = dono;
        this.cor = cor;
        this.raca = raca;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDono(){
        return this.dono;
    }

    public abstract void fala()
}

// obs: Um método abstrato não é feito para ser utilizado, mas para ser implementado pelas classes herdeiras