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
            //Se nenhum hardware for passado é iniciado um array vazio
            this.hardwares = new HardwareBasico[0];
        }
    }

    //Metodos
    public void mostraPCConfigs() {

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
