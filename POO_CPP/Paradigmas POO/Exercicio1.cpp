#include <iostream>

using namespace std;

class Personagem{
    private:

    public:
    string nome;
    int nivel;
    int dano;
    int vida;

    Personagem(string nome, int nivel, int dano, int vida){
        this->nome = nome;
        this->nivel = nivel;
        this->dano = dano;
        this->vida = vida;
    }

    void atacar(Personagem p0){
        cout << "O personagem " << p0.nome << " foi atacado pelo " << this->nome << endl;
        p0.vida -= this->dano;
    }

};


int main(){

    Personagem p1("Dudu", 10, 7, 8);

    Personagem p2("Jorge", 9, 5, 7);

    p1.atacar(p2);

    return 0;
}