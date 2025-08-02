import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lanche1 = input.nextInt();
        int lanche2 = input.nextInt();
        int lanche3 = input.nextInt();

        input.close();

        int total = lanche1 + lanche2 + lanche3;
        int media = total / 3;

        System.out.println("Total de lanche consumido: " + total);
        System.out.println("Media de lanche consumido: " + media);
    }
}
