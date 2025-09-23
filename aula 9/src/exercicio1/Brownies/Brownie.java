package exercicio1.Brownies;

public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    protected static Brownie[] brownies = new Brownie[10];
    protected static int qntComprados = 0;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras (){
        System.out.println("Adicionando no seu carrinho de compras um " + nome);
        brownies[qntComprados] = this;
        qntComprados++;
    }

    public void calculaValorTotalCompra(){
        double precoTotal = 0;
        System.out.println("Brownies comprados: ");
        for (int i = 0; i < brownies.length; i++) {
            if(brownies[i] == null){
                continue;
            }
            precoTotal += brownies[i].getPreco();
            System.out.println(brownies[i].nome);
        }
        System.out.println("Valor total da compra: R$" + precoTotal);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Sabor: " + sabor);
        System.out.println("Preco: " + preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}
