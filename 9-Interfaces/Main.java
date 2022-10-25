public class Main {
    public static void main(String args[]) {
        Cachorro dog = new Cachorro("Dot", "Brenda", "Malhado", "SRD");
        Gato cat = new Gato("Sheldon", "Rafael", "Laranja", "SRD");
        Veterinario vet = new Veterinario("Dr. Dogtor", 123456, 150.0);

        cat.fala();
        dog.fala();

        verificaFicha(cat);
        verificaFicha(vet);

        vet.consulta(cat);
    }

    public static void verificaFicha(Cadastravel cad) {
        System.out.println("Consultando a ficha...");
        cad.mostraFicha();
    }
}
