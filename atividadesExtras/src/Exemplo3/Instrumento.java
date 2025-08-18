package Exemplo3;

public class Instrumento {
    // atributos
    String tipo;
    String afinacao;

    // metodos
    void emitirSom(){

    }

    void afinar(){
        afinacao = "afinado";
    }

    boolean avaliarAfinacao(){
        if(afinacao == "afinado"){
            return true;
        }
        else {
            return false;
        }
    }
}
