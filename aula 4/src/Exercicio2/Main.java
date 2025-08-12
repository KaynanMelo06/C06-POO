package Exercicio2;

public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        z1.nome = "Silas";
        z1.vida = 100.0;

        Zumbi z2 = new Zumbi();
        z2.nome = "Marco";
        z2.vida = 150.0;

        System.out.println("zumbi1: " + z1.mostraVida());
        System.out.println("zumbi2: " + z2.mostraVida());

        z2.transfereVida(z1, 50);
        System.out.println("Vida transferida!");

        System.out.println("zumbi1: " + z1.mostraVida());
        System.out.println("zumbi2: " + z2.mostraVida());

    }

}