import Computador.Computador;
import Cliente.Cliente;
import Computador.HardwareBasico;
import Computador.MemoriaUSB;
import Computador.SistemaOperacional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matricula = 2197;
        /**HardWare Basicos*/
        //Processadores
        HardwareBasico processador1 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico processador2 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico processador3 = new HardwareBasico("Pentium Core i7", 4500);
        //Memoria RAM
        HardwareBasico memoriaRAM1 = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico memoriaRAM2 = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico memoriaRAM3 = new HardwareBasico("Memoria RAM", 32);
        //Armazenamento
        HardwareBasico HD1 = new HardwareBasico("HD", 500);
        HardwareBasico HD2 = new HardwareBasico("HD", 1000);
        HardwareBasico HD3 = new HardwareBasico("HD", 2000);

        /**Sistemas Operacionais*/
        //SistemaOperacional1
        SistemaOperacional sistemaOperacional1 = new SistemaOperacional();
        sistemaOperacional1.setNome("MacOS Sequoia");
        sistemaOperacional1.setTipo(64);
        //SistemaOperacional2
        SistemaOperacional sistemaOperacional2 = new SistemaOperacional();
        sistemaOperacional2.setNome("Windows 8");
        sistemaOperacional2.setTipo(64);
        //SistemaOperacional3
        SistemaOperacional sistemaOperacional3 = new SistemaOperacional();
        sistemaOperacional3.setNome("Windows 10");
        sistemaOperacional3.setTipo(64);

        /**Memorias USB*/
        //penDrive 1
        MemoriaUSB penDrive1 = new MemoriaUSB();
        penDrive1.setNome("penDrive");
        penDrive1.setCapacidade(16);
        //penDrive 2
        MemoriaUSB penDrive2 = new MemoriaUSB();
        penDrive2.setNome("penDrive");
        penDrive2.setCapacidade(32);
        //HD Externo
        MemoriaUSB HDExterno1 = new MemoriaUSB();
        HDExterno1.setNome("HD Externo");
        HDExterno1.setCapacidade(1000);

        /**Computadores das promocoes montados*/
        //Promocao 1
        HardwareBasico[] hardwarePromocao1 = new HardwareBasico[]{processador1, memoriaRAM1, HD1};
        Computador promocao1 = new Computador("Apple", matricula,hardwarePromocao1, sistemaOperacional1);
        promocao1.addMemoriaUSB(penDrive1);
        //Promocao 2
        HardwareBasico[] hardwarePromocao2 = new HardwareBasico[]{processador2, memoriaRAM2, HD2};
        Computador promocao2 = new Computador("Samsung",matricula + 1234 , hardwarePromocao2, sistemaOperacional2);
        promocao2.addMemoriaUSB(penDrive2);
        //Promocao 3
        HardwareBasico[] hardwarePromocao3 = new HardwareBasico[]{processador3, memoriaRAM3, HD3};
        Computador promocao3 = new Computador("Dell", matricula + 5678, hardwarePromocao3, sistemaOperacional3);
        promocao3.addMemoriaUSB(HDExterno1);


        /**Clientes*/
        //Cliente cliente1 = new Cliente("Fernando", "10");
        Cliente[] clientes = new Cliente[5];
        int clientesCadastrados = 0;
        int codigo;
        String nomeCliente;

        /** Interface Grafica*/
        System.out.println("Bem vindo a loja PCMania!");
        System.out.println(" ");

        //Cadastro
        while (true) {
            if (clientesCadastrados >= clientes.length) {
                System.out.println("Limite de cadastros atingido!");
                break;
            }

            System.out.println("Deseja realizar um novo cadastro?");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO (Ir para as compras)");
            codigo = input.nextInt();
            input.nextLine();

            if (codigo == 1) {
                System.out.println("Vamos fazer seu cadastro:");
                System.out.print("Digite seu nome: ");
                nomeCliente = input.nextLine();
                System.out.print("Digite seu CPF: ");
                String cpfCliente = input.nextLine();

                //cria o cliente e o adiciona na proxima posição livre do array
                clientes[clientesCadastrados] = new Cliente(nomeCliente, cpfCliente);
                clientesCadastrados++;
                System.out.println("Cliente cadastrado com sucesso!");

            } else if (codigo == 2) {
                System.out.println("Cadastro finalizado. Vamos para as compras!");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        if (clientesCadastrados ==0){
            System.out.println("Nenhum cliente cadastrado!");
            return;
        }

        //Login
        Cliente clienteLogado = null;
        while (clienteLogado == null) {
            System.out.print("Por favor, digite seu CPF para continuar: ");
            String cpfLogin = input.nextLine();

            for (int i = 0; i < clientesCadastrados; i++) {
                if (clientes[i].getCpf().equals(cpfLogin)) {
                    clienteLogado = clientes[i];
                    break;
                }
            }

            if (clienteLogado == null) {
                System.out.println("CPF não encontrado. Tente novamente.");
            }
        }

        //input.nextLine(); //retirar o buffer, igual o cin.ignore em c++
        System.out.println("Login realizado com sucesso! Bem-vindo(a), " + clienteLogado.getNome() + "!");

        //Compra dos pcs
        int codigoCompra;
        //array para salvar os computadores comprados
        Computador[] computadoresComprados = new Computador[10];
        int qntComputadores = 0;

        do {
            System.out.println("Digite o código de qual computador deseja comprar!");
            System.out.println("1 - PC Promoção 1");
            promocao1.mostraPCConfigs();
            System.out.println("2 - PC Promoção 2");
            promocao2.mostraPCConfigs();
            System.out.println("3 - PC Promoção 3");
            promocao3.mostraPCConfigs();
            System.out.println("Caso deseje sair, digite 0!");
            System.out.print("Codigo: ");
            codigoCompra = input.nextInt();
            input.nextLine();

            if (codigoCompra == 0) {
                break;
            }

            switch (codigoCompra) {
                case 1:
                    System.out.println(clienteLogado.getNome() + " está comprando o computador da promoção 1");
                    computadoresComprados[qntComputadores] = promocao1;
                    qntComputadores++;
                    break;
                case 2:
                    System.out.println(clienteLogado.getNome() + " está comprando o computador da promoção 2");
                    computadoresComprados[qntComputadores] = promocao2;
                    qntComputadores++;
                    break;
                case 3:
                    System.out.println(clienteLogado.getNome() + " está comprando o computador da promoção 3");
                    computadoresComprados[qntComputadores] = promocao3;
                    qntComputadores++;
                    break;
                default:
                    System.out.println("Código não existe, tente novamente!");
                    break;
            }
        } while (codigoCompra != 0);

        System.out.println("Seu carrinho de compras: ");
        System.out.println("Suas informacoes:");
        System.out.println("Cliente: " + clienteLogado.getNome());
        System.out.println("CPF: " + clienteLogado.getCpf());
        System.out.println("----------------------------------------------");


        //System.out.println("DEBUG -> qntComputadores = " + qntComputadores);

        for (int i = 0; i < qntComputadores; i++) {
            if( computadoresComprados[i] != null) {
                computadoresComprados[i].mostraPCConfigs();
            }
        }

        clienteLogado.setComputadores(computadoresComprados);

        System.out.println("Preco total do seu carrinho: $" + clienteLogado.calculaTotalCompra());

        System.out.println("Obrigado pela visita, " + clienteLogado.getNome() + ". Saindo...");

        input.close();
    }

}