public class Computador {
    //Atributos
    private String marca;
    private float preco;

    //Agregacao
    private HardwareBasico[] hardwareBasicos;
    private MemoriaUSB[] memoriaUSBs;
    private SistemaOperacional sistemaOperacional;

    //Construtores
    public Computador(HardwareBasico[] hardwareBasicos, SistemaOperacional sistemaOperacional) {
        this.hardwareBasicos = hardwareBasicos;
        this.sistemaOperacional = sistemaOperacional;
    }


    //Metodos
    public void mostraPCConfigs(){

    }

    public void addMemoriaUSB(MemoriaUSB musb){

    }


}
