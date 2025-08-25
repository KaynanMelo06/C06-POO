package Exercicio0;

public class Main {
    public static void main(String[] args) {

        Cantina c1 = new Cantina();
        c1.nome = "da Neid";

        Salgado s1 = new Salgado();
        s1.nome = "coxinha";
        Salgado s2 = new Salgado();
        s2.nome = "esfirra";
        Salgado s3 = new Salgado();
        s3.nome = "cigarrete";

        c1.addSalgado(s1);
        c1.addSalgado(s2);
        c1.addSalgado(s3);

        c1.mostraInfo();
    }
}
