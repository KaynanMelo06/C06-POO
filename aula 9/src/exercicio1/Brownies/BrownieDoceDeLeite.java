package exercicio1.Brownies;

public class BrownieDoceDeLeite extends Brownie{


    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando um Brownie de Doce de leite no seu carrinho de compras!");
        brownies[qntComprados] = this;
        qntComprados++;
    }

    public void addDoceDeLeite(){
        System.out.println(super.nome + " adicionando mais Doce de leite");
    }
}
