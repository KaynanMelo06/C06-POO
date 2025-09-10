package exercicio1.br.inatel.cdg.jogador;

import exercicio1.br.inatel.cdg.inimigo.Asteroide;

import javax.xml.transform.Source;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;


    public Nave (String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        
        if (ast.getTipoAsteroide() == "grande" && tipoTiro == "explosivo"){
            System.out.println("A Nave " + this.nome + " atirou no asteroide " + ast.getNome() + " e o EXPLODIU!!!!!");
            ast.destruir();
        } else if (ast.getTipoAsteroide() == "pequeno" && tipoTiro == "normal") {
            System.out.println("A Nave " + this.nome + " atirou no asteroide " + ast.getNome() + " e o EXPLODIU!!!!!");
            ast.destruir();
        } else {
            System.out.println("O tiro não é forte o suficiente para destruir o asteroide!");
        }
    }

}
