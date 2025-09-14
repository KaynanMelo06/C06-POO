package Computador;

public class ProcessarPedido {

    public static void processar(Computador[] computadores) {
        if (computadores == null) {
            System.out.println("Não foi possível processar o pedido por falta de dados.");
            return;
        }
        System.out.println("Processando o pedido...");
    }
}
