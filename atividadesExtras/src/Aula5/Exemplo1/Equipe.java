package Aula5.Exemplo1;

public class Equipe {
    String nome;
    Heroi[] herois; // Um array de objetos da classe Heroi
    int totalHerois = 0; // Contador para saber quantos heróis já temos

    // Construtor
    public Equipe(String nome) {
        this.nome = nome;
        this.herois = new Heroi[10]; // Definindo um tamanho máximo de 10 heróis para a equipe
    }

    //Métodos
    void adicionarHeroi(Heroi novoHeroi){
        if (totalHerois < herois.length){
            herois[totalHerois] = novoHeroi;
            totalHerois++;
            System.out.println("O herói " + novoHeroi.nome + " foi adicionado à equipe!");
        }
        else {
            System.out.println("A equipe já está cheia! Não é possível adicionar mais heróis.");
        }
    }

    void mostraInfo(){
        System.out.println("\n--- Informações da Equipe ---");
        System.out.println("Nome da Equipe: " + this.nome);
        System.out.println("Membros da Equipe:");

        for (int i =0; i < totalHerois; i++){
            System.out.println(" - Nome: " + herois[i].nome + " | Poder: " + herois[i].poder);
        }
        System.out.println("---------------------------");
    }
}
