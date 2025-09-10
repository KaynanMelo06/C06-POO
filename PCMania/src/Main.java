import Computador.Computador;
import Cliente.Cliente;
import Computador.HardwareBasico;
import Computador.MemoriaUSB;
import Computador.SistemaOperacional;

public class Main {
    public static void main(String[] args) {
        /**HardWare Basicos*/
        //Processadores
        HardwareBasico processador1 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico processador2 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico processador3 = new HardwareBasico("Pentium Corte i7", 4500);

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

        /**Memorias USB */
        //Pen-Drives
        MemoriaUSB penDrive1 = new MemoriaUSB();
        penDrive1.setNome("penDrive");
        penDrive1.setCapacidade(16);

        MemoriaUSB penDrive2 = new MemoriaUSB();
        penDrive2.setNome("penDrive");
        penDrive2.setCapacidade(32);

        //HD Externo
        MemoriaUSB HDExterno1 = new MemoriaUSB();
        HDExterno1.setNome("HD Externo");
        HDExterno1.setCapacidade(1000);


        //Promocao 1
        HardwareBasico[] hardwarePromocao1 = new HardwareBasico[]{processador1, memoriaRAM1, HD1};
        Computador promocao1 = new Computador("Apple", 1,hardwarePromocao1, sistemaOperacional1);
        promocao1.addMemoriaUSB(penDrive1);

        //Promocao 2
        HardwareBasico[] hardwarePromocao2 = new HardwareBasico[]{processador2, memoriaRAM2, HD2};
        Computador promocao2 = new Computador("Samsung", 2, hardwarePromocao2, sistemaOperacional2);
        promocao2.addMemoriaUSB(penDrive2);

        //Promocao 3
        HardwareBasico[] hardwarePromocao3 = new HardwareBasico[]{processador3, memoriaRAM3, HD3};
        Computador promocao3 = new Computador("Dell", 3, hardwarePromocao3, sistemaOperacional3);
        promocao3.addMemoriaUSB(HDExterno1);


    }
}