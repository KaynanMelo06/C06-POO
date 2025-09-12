package Computador;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    // Construtor para inicializar os atributos
    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

}
