package Exercicio6;

import java.sql.SQLOutput;

public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println(piloto.nome + " Pulou!");
    }

    void soltarTurbo(){
        System.out.println(piloto.nome + " SOLTOU UM TURBOOOO!!!!");
    }

    void fazerDrift(){
        System.out.println(piloto.nome + " FEZ DRIFT!!!!!");
    }
}
