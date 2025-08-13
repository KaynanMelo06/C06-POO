package Exercicio4;

public class Zumbi {
    //Membros
    String nome;
    double vida;
    Boolean podeTransferir = false;

    //Métodos
    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){

        if ((vida - quantia) <= 0){
            podeTransferir = false;
        }
        else {
            podeTransferir = true;
            vida -= quantia;
            zumbiAlvo.vida += quantia;
        }

    }

}
