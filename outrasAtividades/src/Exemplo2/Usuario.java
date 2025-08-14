package Exemplo2;

public class Usuario {
    // atributos
    String nome;
    String email;
    Post post;

    // metodos
    Post fazerPost(String conteudo){
        post = new Post();
        post.autor = this;
        post.conteudo = conteudo;
        post.curtidas = 0;

        return  post;
    }
}
