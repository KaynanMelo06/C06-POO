#include <iostream>

using namespace std;

class Pessoa
{
private:
    string nome;
public:

    virtual void apresentar(){

        cout << "Ola, meu nome e " << this->nome << " e soou uma pessoa." << endl;
        
    }

    string getNome(){
        return nome;
    }
};

class Professor: public Pessoa
{
private:
    string disciplina;
public:

void apresentar() override {
    cout << "Ola, meu nome e " << getNome() << " e sou um professor de " << this->disciplina << "." << endl;
}

};

class Aluno: public Pessoa
{
private:
    string curso;
    int matricula;
public:

void apresentar() override {
    cout << "Ola, meu nome e " << getNome() << " e eu sou aluno do curso " << this->curso << "." << endl;
}
};


int main(){


    return 0;
}