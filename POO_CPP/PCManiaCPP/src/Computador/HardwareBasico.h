#pragma once
#include <string>
#include <iostream>

using namespace std;

class HardwareBasico {
private:
    // Atributos
    string nome;
    float capacidade;

public:
    // Construtor
    HardwareBasico(string nome, float capacidade);

    // Métodos "Getters"
    string getNome();
    float getCapacidade();
};