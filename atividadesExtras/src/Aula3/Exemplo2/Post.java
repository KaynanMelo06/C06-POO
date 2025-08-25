package Aula3.Exemplo2;

public class Post {
    // atributos
    Usuario autor;
    String conteudo;
    int curtidas;

    // metodos
    void recerberCurtida(){
        this.curtidas += 1;
    }

    void mostrarDados(){
        System.out.println("Autor: " + this.autor.nome);
        System.out.println("Conteudo: " + this.conteudo);
        System.out.println("Curtidas: " + this.curtidas);
    }

}
