package Computador;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    // Construtor para inicializar os atributos
    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Getters e Setters (boas práticas de encapsulamento)
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

}
