package exercicio1;

import exercicio1.Brownies.BrownieCafe;
import exercicio1.Brownies.BrownieDoceDeLeite;
import exercicio1.Brownies.BrownieNutella;
import exercicio1.Comprador.Comprador;

public class Main {
    static void main() {
        BrownieCafe bc = new BrownieCafe("Brownie de cafe", 5.5, "café");
        BrownieNutella bn = new BrownieNutella("Brownie de Nutella", 7, "Nutella");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("Brownie de doce de leite", 4.25, "Doce de leite");

        bl.mostraInfo();

        bc.addCafe();
        bn.adicionaNutella();
        bl.addDoceDeLeite();

        Comprador comprador1 = new Comprador("Pedro", 20);
        comprador1.efetuarCompra(bc);

        //

    }
}
