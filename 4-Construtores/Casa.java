// Múltiplos Construtores
public class Casa {
    String endereco;
    double area;

    public Casa() {
        this.area = 0;
        this.endereco = "Nenhum";
        // this.(0.0,"Nenhum");
    }

    public Casa(double a) {
        this.area = a;
        this.endereco = "Nenhum";
        // this.(a,"Nenhum");
    }
    
    public Casa(String e) {
        this.area = 0;
        this.endereco = e;
        // this.(0.0, e)
    }
    
    public Casa(double a, String e) {
        this.area = a;
        this.endereco = e;
    }

}