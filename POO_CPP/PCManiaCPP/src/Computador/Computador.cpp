#include "Computador.h"

//Construtor
Computador::Computador(string marca, float preco, vector<HardwareBasico> hardwaresIniciais, SistemaOperacional sistemaOperacional){
    this->marca = marca;
    this->preco = preco;
    this->sistemaOperacional = sistemaOperacional;

    this->hardwares = hardwaresIniciais;
}

//metodos
void Computador::mostraPCConfigs() {
    cout << "configuracao do computador: " << endl;
    cout << "Marca : " << this->marca << endl;
    cout << "Preco : " << this->preco << endl;
    cout << "Processador : " << this->hardwares.at(0).getNome() << "(" << this->hardwares.at(0).getCapacidade() << "Mhz)" << endl;
    cout << "Memoria Ram : " << this->hardwares.at(1).getCapacidade() << " Gb" << endl;
    cout << "Armazenamento: " << this->hardwares.at(2).getCapacidade() << " GB" << endl;
    cout << "Sistema Operacional: " << this->sistemaOperacional.getNome() << "(" << this->sistemaOperacional.getTipo() << " Bits)" << endl;
    cout << "Acompanha: " << this->memoriaUSB.getNome() << " de " << this->memoriaUSB.getCapacidade() << " Gb" << endl;
    cout << "----------------------------------------------" << endl;
}

void Computador::addMemoriaUSB(MemoriaUSB musb){
    this->memoriaUSB = musb;
}

//getter
float Computador::getPreco(){
    return preco;
}
