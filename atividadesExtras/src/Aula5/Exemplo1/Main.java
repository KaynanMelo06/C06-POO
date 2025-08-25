package Aula5.Exemplo1;

public class Main {
    public static void main(String[] args) {
        Equipe vingadores = new Equipe("Vingadores");

        Heroi heroi1 = new Heroi("Homem de Ferro", "Armadura Tecnológica");
        Heroi heroi2 = new Heroi("Capitão América", "Super Força e Escudo");
        Heroi heroi3 = new Heroi("Thor", "Deus do Trovão");

        // 3. Adicione os Heróis na Equipe
        vingadores.adicionarHeroi(heroi1);
        vingadores.adicionarHeroi(heroi2);
        vingadores.adicionarHeroi(heroi3);

        vingadores.mostraInfo();
    }
}
