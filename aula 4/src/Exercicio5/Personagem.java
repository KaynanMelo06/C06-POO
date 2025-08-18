package Exercicio5;

public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArma(){
        System.out.println( nome + " utilizou " + arma.nome + " e a danificou!");
        arma.resistencia -= 2;

    }

    void tomarDano(){
        System.out.println( nome + " Recebeu 5 de dano");
        pontos -= 5;
    }
}
