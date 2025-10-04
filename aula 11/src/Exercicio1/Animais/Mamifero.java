package Exercicio1.Animais;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public void Mamifero(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("Informacoes: ");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
