package Aula3.Exemplo3;

public class Musico {
    // atributos
    String nome;
    Instrumento instrumento;

    // metodos
    void tocarMusica(){

        System.out.println("O musico " + nome + " esta tocando!");
        instrumento.emitirSom();
    }




}
