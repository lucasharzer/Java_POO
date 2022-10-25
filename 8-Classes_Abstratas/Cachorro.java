public class Cachorro extends Pet{

    public Cachorro(String nome, String dono, String cor, String raca) {
        super(nome, dono, cor, raca);
    }

    public void fala() {
        System.out.println(this.getNome() + " faz au au.");
    }
}
