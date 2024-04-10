package carro;

public class Carro {
    public static void main(String[] args) {
        
        MainCarro c = new MainCarro ("Toyota", "Corolla", 2024);
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getAno());
        
        c.setMarca("\nHonda");
        c.setModelo("Civic");
        c.setAno(2024);
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getAno());
    }
}
