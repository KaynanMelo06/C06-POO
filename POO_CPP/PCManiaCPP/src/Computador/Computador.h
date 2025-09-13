#pragma once

#include <iostream>
#include <string>
#include <vector>

#include "HardwareBasico.h"
#include "SistemaOperacional.h"
#include "MemoriaUSB.h"

using namespace std;

class Computador{
private:
    //atributos
    string marca;
    float preco;

    //agregacao
    vector<HardwareBasico> hardwares;
    MemoriaUSB memoriaUSB;
    SistemaOperacional sistemaOperacional;

public:
    //Construtor
    Computador(string marca, float preco, vector<HardwareBasico> hardwaresIniciais, SistemaOperacional sistemaOperacional);

    //metodos
    void mostraPCConfigs();
    void addMemoriaUSB(MemoriaUSB musb);

    //getter
    float getPreco();

};