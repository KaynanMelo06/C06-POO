package Exercicio1.Animais;

public class Lontra extends Mamifero{

    public Lontra(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public void emitirSom() {
        System.out.println("Hah!");
    }
}
