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

        return 0;
    }

    public void setComputadores(Computador[] computadores) {
        if (computadores != null) {
            this.computadores = new Computador[computadores.length];
            for (int i = 0; i < computadores.length; i++) {
                this.computadores[i] = computadores[i];
            }
        } else {
            //Se nenhum computador for passado e iniciado um array vazio
            this.computadores = new Computador[0];
        }
    }
}
