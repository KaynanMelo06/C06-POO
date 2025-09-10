package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente[];

    public Conta(){
        cliente = new Cliente[3];
    }

    public float getSaldo() {
        return saldo;
    }

    public void sacar (float quantia){
        if(this.saldo>quantia){
            saldo -= quantia;
        }
    }

    public void deposita (float quantia){
        saldo += quantia;
    }

    //Getters e Setters
    public float getSaldo(){
        return this.saldo;
    }
    public float getLimite(){
        return this.limite;
    }
    public void setLimite(float limite){
        this.limite = limite;
    }
    public Cliente[] getClientes() {
        return clientes;
    }
    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
