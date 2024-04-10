package estudante;

import java.util.Scanner;

public class MainEstudante {
    public static void main(String[] args) {
        Scanner STRING = new Scanner(System.in);
        Scanner INT = new Scanner(System.in);
        Scanner DOUBLE = new Scanner(System.in);
        Estudante E = new Estudante ("", 0, 0,"");
       
        
        System.out.print("Olá! Bom te ver de novo. Por favor, responda algumas perguntinhas.");
        System.out.print("\n\nQual o seu nome completo? "); E.setNome(STRING.nextLine());
        System.out.print("Quantos anos você tem? "); E.setIdade(INT.nextInt());
        System.out.print("Qual o nº da sua matrícula? "); E.setMatricula(INT.nextInt());
        System.out.print("Qual foi sua matéria favorita no ano? "); E.setFavorita(STRING.nextLine());
 
        System.out.println("\nDados Escolares De " + E.getNome() + ":");
        System.out.println("- Idade: " + E.getIdade());
        System.out.println("- Nº da matrícula: " + E.getMatricula());
        System.out.println("- Matéria predileta: " + E.getFavorita()); 
        STRING.close();
        
    }
}
