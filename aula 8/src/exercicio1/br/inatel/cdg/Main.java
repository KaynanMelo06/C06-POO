package exercicio1.br.inatel.cdg;

import exercicio1.br.inatel.cdg.inimigo.Asteroide;
import exercicio1.br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave("CrewDragon", 100.0, "explosivo");

        Asteroide asteroide1 = new Asteroide("Halley", "grande");

        nave1.atirar(asteroide1);

    }
}
