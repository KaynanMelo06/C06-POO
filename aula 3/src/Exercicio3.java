import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a nota da NPA: ");

        double NPA = input.nextDouble();
        if (NPA >= 60){
            System.out.println("Você Passou! Não ficou de NP3");
        }
        else if (NPA < 60 && NPA >= 30){
            System.out.println("Ficou de NP3");

            System.out.print("Informe a sua note da NP3: ");
            double notaNP3 = input.nextDouble();
            double NFA = (notaNP3 + NPA)/2.0;
            if (NFA >= 50){
                System.out.println("Você passou!");
            }
            else {
                System.out.println("Não passou!");
            }
        }

        input.close();
    }
}
