public abstract class Pet implements Cadastravel{
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

    public abstract void fala();

    public void mostraFicha(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Dono: " + this.dono);
        System.out.println("Cor: " + this.cor);
        System.out.println("Raça: " + this.raca);
    }
}
