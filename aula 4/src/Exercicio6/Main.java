package Exercicio6;

public class Main {
    public static void main(String[] args) {
        // Criacao do piloto 1 e seu kart
        Piloto Max = new Piloto();
        Max.nome = "Max";
        Max.vilao = false;

        Kart RB20 = new Kart();
        RB20.piloto = Max;
        RB20.nome = "RB20";
        RB20.motor.cilindradas = "100cc";
        RB20.motor.velocidadeMaxima = 150;

        // Criacao do piloto 2 e seu Kart
        Piloto Hamilton = new Piloto();
        Hamilton.nome = "Hamilton";
        Hamilton.vilao = true;

        Kart W11 = new Kart();
        W11.piloto = Hamilton;
        W11.nome = "W11";
        W11.motor.cilindradas = "50cc";
        W11.motor.velocidadeMaxima = 100;

        RB20.motor.mostrarInfo();
        Max.soltaSuperPoder();
        RB20.soltarTurbo();

        System.out.println("--------------------------");

        W11.motor.mostrarInfo();
        Hamilton.soltaSuperPoder();
        W11.fazerDrift();




    }
}
