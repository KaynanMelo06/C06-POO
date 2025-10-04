package Exercicio1.Animais;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
