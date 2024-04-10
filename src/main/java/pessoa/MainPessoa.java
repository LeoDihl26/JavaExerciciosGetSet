package pessoa;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Pessoa p = new Pessoa ("", 0);
       
        System.out.print("Digite o seu nome: "); p.setNome(teclado.nextLine());
        System.out.print("Digite a sua idade: ");p.setIdade(teclado.nextInt());
        System.out.println("\nNome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        
        //////////////////////////////////////////////////////////////////////
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        System.out.print("Digite um novo nome: ");p.setNome(teclado2.nextLine());
        System.out.print("Digite a nova idade: ");p.setIdade(teclado2.nextInt());
        System.out.println("\nNovo nome: " + p.getNome());
        System.out.println("Nova idade: " + p.getIdade());
        
        teclado.close();
    }
}
