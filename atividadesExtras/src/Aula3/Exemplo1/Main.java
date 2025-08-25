package Aula3.Exemplo1;

public class Main {
    public static void main(String[] args) {

        // criando o heroi 1
        SuperHeroi heroi1 = new SuperHeroi();
        SuperPoder poder1 = new SuperPoder();
        // atributos do heroi 1
        heroi1.nome = "Batman";
        heroi1.energia = 30;
        heroi1.vida = 50;
        heroi1.superpoder = poder1;
        // superPoder do heroi 1
        poder1.nome = "Arpao";
        poder1.dano = 20;
        poder1.custoEnergia = 15;

        // criando o heroi 2
        SuperHeroi heroi2 = new SuperHeroi();
        SuperPoder poder2 = new SuperPoder();
        // atributos do heroi 2
        heroi2.nome = "SuperMan";
        heroi2.vida = 75;
        heroi2.energia = 55;
        heroi2.superpoder = poder2;
        // superPoder do heroi 2
        poder2.nome = "Raio-Laser";
        poder2.dano = 40;
        poder2.custoEnergia = 30;

        // mostrando os atributos no terminal
        heroi1.mostrarStatus();
        heroi2.mostrarStatus();

        // batman usando poder
        heroi1.usarPoder(heroi2);
        // mostrando os atributos no terminal
        heroi1.mostrarStatus();
        heroi2.mostrarStatus();
        //superman usando poder
        heroi2.usarPoder(heroi1);
        // mostrando os atributos no terminal
        heroi1.mostrarStatus();
        heroi2.mostrarStatus();

    }
}
