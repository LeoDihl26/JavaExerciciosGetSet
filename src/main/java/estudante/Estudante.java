package estudante;

import java.util.Scanner;

public class Estudante {
    private String nome;
    private int idade;
    private int matricula;
    private String favorita;
    
    
    // Construtor
    public Estudante (String n, int i, int m, String f){
        this.nome = n;
        this.idade = i;
        this.matricula = m;
        this.favorita = f;
        
    }
    
    // Métodos Get
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getFavorita(){
        return favorita;
    }
    
    // Métodos Set
    public void setNome(String n){
        this.nome = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }
    public void setFavorita(String f){
        this.favorita = f;
    }
}