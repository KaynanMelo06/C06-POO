import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAlunos = input.nextInt();

        switch (numAlunos){
            case 10:
                System.out.println("Sua sala é a I-16");
                break;
            case 20:
                System.out.println("Sua sala é a I-16");
                break;
            case 30:
                System.out.println("Sua sala é a I-22");
                break;
            default:
                System.out.println("Numero de alunos invalido");
        }
    }
}
