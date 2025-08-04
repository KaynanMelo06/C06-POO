import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com valor de lanche 1: ");
        int lanche1 = input.nextInt();
        System.out.print("Entre com valor de lanche 2: ");
        int lanche2 = input.nextInt();
        System.out.print("Entre com valor de lanche 3: ");
        int lanche3 = input.nextInt();

        input.close();

        int total = lanche1 + lanche2 + lanche3;
        double media = total / 3.0;

        System.out.println("Total de lanche consumido: " + total);
        System.out.println("Media de lanche consumido: " + media);
    }
}
