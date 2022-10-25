public class Gato extends Pet{

    public Gato(String nome, String dono, String cor, String raca) {
        super(nome, dono, cor, raca);
    }

    public void fala() {
        System.out.println(this.getNome() + " faz miau.");
    }
}
