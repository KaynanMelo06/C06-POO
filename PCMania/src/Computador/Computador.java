package Computador;

public class Computador {
    //Atributos
    private String marca;
    private float preco;

    //Agregacao
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoriaUSBs;
    private SistemaOperacional sistemaOperacional;


    public Computador(String marca, float preco, HardwareBasico[] hardwaresIniciais, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;

        if (hardwaresIniciais != null) {
            this.hardwares = new HardwareBasico[hardwaresIniciais.length];
            for (int i = 0; i < hardwaresIniciais.length; i++) {
                this.hardwares[i] = hardwaresIniciais[i];
            }
        } else {
            //Se nenhum hardware for passado e iniciado um array vazio
            this.hardwares = new HardwareBasico[0];
        }
    }

    //Metodos
    public void mostraPCConfigs() {
        System.out.println("Configuração do Computador:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);
        System.out.println("Processador: " + this.hardwares[0].getNome() + "(" + this.hardwares[0].getCapacidade() + " MHz)");
        System.out.println("Memoria RAM: " + this.hardwares[1].getCapacidade() + " Gb");
        System.out.println("Armazenamento: " + this.hardwares[2].getCapacidade() + " Gb de HD");
        System.out.println("Sistema Operacional: " + this.sistemaOperacional.getNome() + "(" + this.sistemaOperacional.getTipo() + " Bits)");
        System.out.println("Acompanha: " + this.memoriaUSBs.getNome() + " de " + this.memoriaUSBs.getCapacidade() + " Gb");
        System.out.println("------------------------------------------------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSBs = musb;
    }

    //Setters
    public void setPreco(float preco) {
        this.preco = preco;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    /** Pocivelmente Precisa de modificação*/
    public HardwareBasico[] getHardwares() {
        return hardwares;
    }

    public MemoriaUSB getMemoriaUSBs() {
        return memoriaUSBs;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }
}
