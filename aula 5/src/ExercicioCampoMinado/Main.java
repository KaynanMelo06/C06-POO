package ExercicioCampoMinado;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        // Gera num aleatorio entre 0 e 1
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        Scanner input = new Scanner(System.in);

        boolean [][] matrizExemplo;
        matrizExemplo = new boolean[2][2];

        for (int i = 0; i < matrizExemplo.length; i++){
            for (int j = 0; j < matrizExemplo[i].length; j++) {
                matrizExemplo[i][j] = false;
                matrizExemplo[x][y] = true;
            }
        }


        // Apenas para mostrar o resultado
        /*
        System.out.println("---------------------------");
        for (int i = 0; i < matrizExemplo.length; i++){
            for (int j = 0; j < matrizExemplo[i].length; j++) {
                System.out.println(matrizExemplo[i][j] + " ");
            }
        }
        System.out.println("---------------------------");
        */

        for (int i = 0; i < matrizExemplo.length; i++){
            for (int j = 0; j < matrizExemplo[i].length; j++) {

                System.out.println("Digite o numero na posição I, entre 0 e 1");
                int digitadoi = input.nextInt();
                System.out.println("Digite o numero na posição J, entre 0 e 1");
                int digitadoj = input.nextInt();

                if (matrizExemplo[digitadoi][digitadoj]) {
                    System.out.println("EXPLODIU!!!!");
                    break;
                }
                else {
                    System.out.println("Continue, esta indo bem!!!");
                }
            }
        }

    }
}
