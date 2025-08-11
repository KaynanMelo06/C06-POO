package Exercicio2;

public class Zumbi {
    //Membros
    String nome;
    double vida;

    //Métodos
    void mostraVida(){
        System.out.println(this.vida);
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida = quantia;
    }

}
