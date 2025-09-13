#include "SistemaOperacional.h"

SistemaOperacional::SistemaOperacional(){}

void SistemaOperacional::setTipo(int tipo){
    this->tipo = tipo;
}

void SistemaOperacional::setNome(string nome){
    this->nome = nome;
}

int SistemaOperacional::getTipo(){
    return tipo;
}

string SistemaOperacional::getNome(){
    return nome;
}
