// Classe ABSTRATA
public abstract class Auto {
    private String marca;
    private int ano;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setAno(int ano){
        this.ano = ano; 
    }

    public int getAno(){
        return ano;
    }
}
