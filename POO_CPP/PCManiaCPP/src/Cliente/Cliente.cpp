#include "Cliente.h"

Cliente::Cliente(string nome, string cpf){
    this->nome = nome;
    this->cpf = cpf;
    // O vector 'computadores' é inicializado vazio por padrão
}

float Cliente::calculaTotalCompra(){
    float precoTotal = 0;
    for (size_t i=0; i<computadores.size() ; i++){
        // Acessamos o elemento na posição 'i' com .at(i)
        precoTotal += computadores.at(i).getPreco();
    }
    return precoTotal;

}

void Cliente::setComputadores(vector<Computador> computadores){
    this->computadores = computadores;
}

string Cliente::getCpf(){
    return this->cpf;
}

string Cliente::getNome(){
    return this->nome;
}