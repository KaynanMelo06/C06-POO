package Exercicio1;

import Exercicio1.Animais.Boi;
import Exercicio1.Animais.Cachorro;
import Exercicio1.Animais.Lontra;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bilbo", 10000000);
        Lontra lontra = new Lontra("Sid", 100);
        Boi boi = new Boi("Ben", 500);

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();

        cachorro.emitirSom();
        lontra.emitirSom();
        boi.emitirSom();

        lontra.nadar();
    }
}
