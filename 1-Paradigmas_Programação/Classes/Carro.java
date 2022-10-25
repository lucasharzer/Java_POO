// Classe CONCRETA
public class Carro extends Auto {
    public void carro(){
        this.setMarca("VW"); 
        this.setAno(2019);
        System.out.println(" O carro é um: " + this.getMarca() + "\n O ano do carro é: " + this. getAno());
    }
}
