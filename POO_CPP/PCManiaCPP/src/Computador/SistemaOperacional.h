#pragma once

#include <iostream>
#include <string>

using namespace std;

class SistemaOperacional{
    private: 
        string nome;
        int tipo;
    public:
        SistemaOperacional();
        void setTipo(int tipo);
        void setNome(string nome);

        int getTipo();
        string getNome();
};