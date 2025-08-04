import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int x = rand.nextInt(10) + 1; // Gera numero entre 1 e 10
        int num;

        do {

            System.out.print("Adivinhe o numero de 1 a 10: ");
            num = input.nextInt();

            if (num == x){
                System.out.println("Você acertou o numero! Parabens!");
            }
            else {
                System.out.println("Voce errou! Tente novamente!");
            }

        }while(num != x);






    }
}
