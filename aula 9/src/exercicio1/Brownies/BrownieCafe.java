package exercicio1.Brownies;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Cafe no seu carrinho de compras!");
        brownies[qntComprados] = this;
        qntComprados++;
    }

    public void addCafe(){
        System.out.println(super.nome + " adicionando mais cafe");
    }
}
