package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Marco";
        zumbi2.nome = "Silas";

        zumbi1.vida = input.nextDouble();
        zumbi2.vida = input.nextDouble();

        System.out.println("Vida do zumbi1: " + zumbi1.mostraVida());
        System.out.println("Vida do zumbi2: " + zumbi2.mostraVida());

        zumbi1 = zumbi2;

        System.out.println("Vida do zumbi1: " + zumbi1.mostraVida());
        System.out.println("Vida do zumbi2: " + zumbi2.mostraVida());

        zumbi2.vida = input.nextDouble();

        System.out.println("Vida do zumbi1: " + zumbi1.mostraVida());
        System.out.println("Vida do zumbi2: " + zumbi2.mostraVida());
    }
}
