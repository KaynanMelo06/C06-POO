#include "MemoriaUSB.h"

    // Implementação do construtor padrão (não faz nada, mas precisa existir se foi declarado)
    MemoriaUSB::MemoriaUSB() {}

    //Getters
    string MemoriaUSB::getNome(){
        return nome;
    }
    int MemoriaUSB::getCapacidade(){
    return capacidade;
    }

    //setters
    void MemoriaUSB::setNome(string nome){
        this->nome = nome;
    }
    void MemoriaUSB::setCapacidade(int capacidade){
        this->capacidade = capacidade;
    }