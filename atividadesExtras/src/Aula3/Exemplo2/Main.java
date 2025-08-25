package Aula3.Exemplo2;

public class Main {
    public static void main(String[] args) {

        // criacao do user1
        Usuario user1 = new Usuario();
        user1.nome = "Francisco";
        user1.email = "Francisco@gmail.com";

        // criacao do user2
        Usuario user2 = new Usuario();
        user2.nome = "Pedro";
        user2.email = "Pedro@outlook.com";


        Post primeiroPost = user1.fazerPost("Primeiro post!!");
        Post segundoPost = user1.fazerPost("Segundo post!!");

        Post terceiroPost = user2.fazerPost("Terceiro post!!!");
        primeiroPost.mostrarDados();
        segundoPost.mostrarDados();
        terceiroPost.mostrarDados();

        primeiroPost.recerberCurtida();
        segundoPost.recerberCurtida();
        segundoPost.recerberCurtida();
        terceiroPost.recerberCurtida();

        primeiroPost.mostrarDados();
        segundoPost.mostrarDados();
        terceiroPost.mostrarDados();
    }
}
