package Computador;

public class Computador {
    //Atributos
    private String marca;
    private float preco;

    //Agregacao
    private HardwareBasico[] hardwares;
    private MemoriaUSB[] memoriaUSBs;
    private SistemaOperacional sistemaOperacional;


    public Computador(String marca, float preco, HardwareBasico[] hardwaresIniciais) {
        this.marca = marca;
        this.preco = preco;

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

    }

    //Setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }

    public void sethardwares(HardwareBasico[] hardwares) {
        this.hardwares = hardwares;
    }
}
