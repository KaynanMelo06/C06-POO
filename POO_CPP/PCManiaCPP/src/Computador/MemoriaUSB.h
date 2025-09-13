#pragma once

#include <string>
#include <iostream>

using namespace std;

class MemoriaUSB{
private:
    string nome;
    int capacidade;
public:
    MemoriaUSB();
    
    //Getters
    string getNome();
    int getCapacidade();

    //setters
    void setNome(string nome);
    void setCapacidade(int capacidade);
};