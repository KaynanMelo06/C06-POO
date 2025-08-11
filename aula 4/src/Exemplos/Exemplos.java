package Exemplos;

public class Exemplos {
    public static class Conta {
        //Membros da Classe
        int numero;
        String nomeDoDono;
        float saldo;
        float limite;

        //Metodos
        void depositar(float quantia){
            saldo += quantia;
        }
        void sacar(float quantia){
            float novoSaldo = saldo - quantia;
            saldo = novoSaldo;
        }
        void transferir(Conta contaDestino, float quantia){
            saldo -= quantia;
            contaDestino.saldo += quantia;
        }
    }

    public static void main(String[] args) {

        /*
        Conta c1 = new Conta();
        c1.nomeDoDono = "Joaquina";
        c1.saldo = 1000;

        System.out.println("O(A) dono(a) da conta é: " + c1.nomeDoDono + " e o saldo é: " + c1.saldo);

        System.out.println("100 reais depositado!");
        c1.depositar(100);
        System.out.println(c1.saldo);

        System.out.println("50 reais sacado!");
        c1.sacar(50);
        System.out.println(c1.saldo);
        */

        Conta c1 =  new Conta();
        c1.nomeDoDono = "Joaquina";
        c1.limite = 1000;
        c1.numero = 1234;
        c1.saldo = 2000;

        Conta c2 = new Conta();
        c2.nomeDoDono = "Jaum";
        c2.limite = 1000;
        c2.numero = 1234;
        c2.saldo = 2000;

        c1.transferir(c2, 100);
        System.out.println("O saldo de c1 é: " + c1.saldo);
        System.out.println("O saldo de c2 é: " + c2.saldo);
    }
}
