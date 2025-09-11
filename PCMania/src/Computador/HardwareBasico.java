package Computador;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    // Construtor para inicializar os atributos
    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //Setters
    public String getNome() {
        return nome;
    }

    //Getters
    public float getCapacidade() {
        return capacidade;
    }

}
