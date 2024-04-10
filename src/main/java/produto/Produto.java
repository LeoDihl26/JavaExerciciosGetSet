package produto;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    
    // Construtor
    public Produto (String n, double i){
        this.nome = n;
        this.preco = i;
    }
    
    // Métodos Get
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    
    // Métodos Set
    public void setNome(String n){
        this.nome = n;
    }
    public void setPreco(double i){
        this.preco = i;
    }
}