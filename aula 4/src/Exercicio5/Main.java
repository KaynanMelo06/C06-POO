package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.nome = "Samuel";
        p1.pontos = 15;

        Personagem p2 = new Personagem();
        p2.nome = "Gustavo";
        p2.pontos = 20;

        Arma arma1 = new Arma();

        arma1.nome = "faca";
        arma1.poder=5;
        arma1.resistencia = 7;
        arma1.descricao = "cortante";

        Arma arma2 = new Arma();

        arma2.nome = "martelo";
        arma2.poder = 5;
        arma2.resistencia = 10;
        arma2.descricao = "esmagadora";

        arma1.mostraInfoArma();
        System.out.println("-------------------------------");
        arma2.mostraInfoArma();
        System.out.println("-------------------------------");


        p1.arma = arma1;
        p2.arma = arma2;

        p1.usarArma();
        p2.tomarDano();

        p2.usarArma();
        p1.tomarDano();

        arma1.mostraInfoArma();
        System.out.println("-------------------------------");
        arma2.mostraInfoArma();
        System.out.println("-------------------------------");

    }
}
