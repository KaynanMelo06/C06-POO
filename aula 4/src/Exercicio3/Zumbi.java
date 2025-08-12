package Exercicio2;

public class Zumbi {
    //Membros
    String nome;
    double vida;

    //Métodos
    double mostraVida(){
        return vida;
        //System.out.println(this.vida);
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

}
