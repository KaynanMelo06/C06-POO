import Computador.Computador;
import Cliente.Cliente;
import Computador.HardwareBasico;
import Computador.MemoriaUSB;
import Computador.SistemaOperacional;

public class Main {
    public static void main(String[] args) {
        //SistemasOperacionais
        SistemaOperacional sistemaOperacional1 = new SistemaOperacional();
        sistemaOperacional1.setNome("MacOS Sequoia");
        sistemaOperacional1.setTipo(64);

        /**HardWareBasicos*/
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


        //Promocao 1
        HardwareBasico[] hardwarePromocao1 = new HardwareBasico[]{processador1, memoriaRAM1, HD1};
        Computador promocao1 = new Computador("Apple", 1,hardwarePromocao1);
//        promocao1.setSistemaOperacional(sistemaOperacional1);

        //Promocao 2
        HardwareBasico[] hardwarePromocao2 = new HardwareBasico[]{processador2, memoriaRAM2, HD2};
        Computador promocao2 = new Computador("Samsung", 2, hardwarePromocao2);

        //Promocao 3
        HardwareBasico[] hardwarePromocao3 = new HardwareBasico[]{processador3, memoriaRAM3, HD3};
        Computador promocao3 = new Computador("Dell", 3, hardwarePromocao3);
        

    }
}