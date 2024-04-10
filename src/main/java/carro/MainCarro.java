package carro;

public class MainCarro {
    private String marca;
    private String modelo;
    private int ano;
    
    // Construtor
    public MainCarro (String m,String mo,int a){
        this.marca = m;
        this.modelo = mo;
        this.ano = a;
    }
    
    // Métodos Get
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    // Métodos Set
    public void setMarca(String m){
        this.marca = m;
    }
    
    public void setModelo(String mo){
        this.modelo = mo;
    }
    
    public void setAno(int a){
        this.ano = a;
    }
}
