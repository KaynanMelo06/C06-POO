package Cliente;

import Computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;

    private Computador[] computadores;


    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){
        float precoTotal = 0;
        for (int i = 0; i < computadores.length; i++) {
            if(computadores[i] == null){
                continue;
            } 
            precoTotal += computadores[i].getPreco();

        }
        return precoTotal;
    }

    //Setter
    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }

    //Getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
