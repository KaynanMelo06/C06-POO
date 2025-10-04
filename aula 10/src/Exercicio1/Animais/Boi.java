package Exercicio1.Animais;

public class Boi extends Mamifero{

    public Boi(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public void emitirSom() {
        System.out.println("Muu!");
    }
}
