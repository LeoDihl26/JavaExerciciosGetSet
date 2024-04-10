package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    
    // Construtor
    public Pessoa (String n, int i){
        this.nome = n;
        this.idade = i;
    }
    
    // Métodos Get
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    
    // Métodos Set
    public void setNome(String n){
        this.nome = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
}
