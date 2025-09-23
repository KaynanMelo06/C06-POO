package exercicio1.Brownies;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Nutella no seu carrinho de compras!");
        brownies[qntComprados] = this;
        qntComprados++;
    }

    public void adicionaNutella(){
        System.out.println(super.nome + " adicionando mais nutella");
    }

}
