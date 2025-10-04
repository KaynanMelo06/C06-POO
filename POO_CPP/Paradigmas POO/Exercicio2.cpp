#include <iostream>

using namespace std;

class Pessoa{
    private:
    string nome;
    int idade;

    public:

    void setNome(string nome){
        this->nome = nome;
    }
    
    string getNome(){
        return nome;
    }
    
    void setIdade(int idade){
        this->idade = idade;
    }

    int getIdade(){
        return idade;
    }

    protected:

};

class Protagonista: public Pessoa{
    private:
    int nivel;

    public:

    void setNivel(int nivel){
        this->nivel = nivel;
    }

    int getNivel(){
        return nivel;
    }
};

class Personagem: public Pessoa{
    private:
    int rank;

    public:

    void setRank(int rank){
        this->rank = rank;
    }

    int getRank(){
        return rank;
    }
};
int main(){

    Protagonista protag;
    protag.setNome("Dudu");
    protag.setNivel(10);

    Personagem perso;
    perso.setNome("Jorge");
    perso.setRank(8);

    protag.getNome();
    protag.getNivel();

    perso.getNome();
    perso.getRank();

    return 0;
}