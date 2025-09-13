#pragma once

#include <string>
#include <vector>
#include "/home/kaynanmelo/Documentos/C06-POO/PCManiaCPP/src/Computador/Computador.h"


using namespace std;

class Cliente{
private:
    string nome;
    string cpf;

    //agregacao
    vector<Computador> computadores;

public:
    //Construtor
    Cliente(string nome, string cpf);

    //metodo
    float calculaTotalCompra();

    //Setter
    void setComputadores(vector<Computador> computadores);

    //Getters
    string getCpf();
    string getNome();
};