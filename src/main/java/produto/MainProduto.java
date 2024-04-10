package produto;

import java.util.Scanner;


public class MainProduto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Produto p = new Produto ("", 0);
       
        System.out.print("Digite o seu nome do produto desejado: "); p.setNome(teclado.nextLine());
        System.out.print("Digite o valor do produto: R$");p.setPreco(teclado.nextDouble());
        System.out.println("\nNome: " + p.getNome());
        System.out.println("Preço: R$" + p.getPreco());
        
        //////////////////////////////////////////////////////////////////////
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        System.out.print("Digite um outro produto: ");p.setNome(teclado2.nextLine());
        System.out.print("Diga qual o seu valor: R$");p.setPreco(teclado2.nextDouble());
        System.out.println("\nNovo nome: " + p.getNome());
        System.out.println("Nova preço: R$" + p.getPreco());

        teclado2.close();       
    }
}