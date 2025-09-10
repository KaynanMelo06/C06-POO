package Computador;

public class SistemaOperacional {
    private String nome;
    private int tipo;


    //Setters
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Getters
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
