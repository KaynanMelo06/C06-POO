#include "HardwareBasico.h"

using namespace std;

// Implementação do Construtor
HardwareBasico::HardwareBasico(string nome, float capacidade) {
    this->nome = nome;
    this->capacidade = capacidade;
}

// Implementação do Getter para o nome
string HardwareBasico::getNome() {
    return this->nome;
}

// Implementação do Getter para a capacidade
float HardwareBasico::getCapacidade() {
    return this->capacidade;
}