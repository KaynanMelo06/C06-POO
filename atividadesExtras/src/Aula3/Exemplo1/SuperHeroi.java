package Aula3.Exemplo1;

public class SuperHeroi {
    // Atributos
    String nome;
    int energia;
    int vida;
    SuperPoder superpoder;

    // Métodos

    /**
     * Este metodo é chamado quando ESTE herói é atacado.
     * A lógica de como ele perde vida fica encapsulada aqui.
     * @param dano A quantidade de dano a ser subtraída da vida.
     */
    void receberDano(int dano){
        System.out.println(this.nome + " recebeu " + dano + " de dano!");
        this.vida -= dano;
    }

    /**
     * ESTE herói ataca outro herói (o alvo).
     * @param alvo O SuperHeroi que será o alvo do poder.
     * @return true se o poder foi usado, false caso contrário.
     */
    boolean usarPoder(SuperHeroi alvo) {
        if (this.energia > this.superpoder.custoEnergia) {

            System.out.println("SuperPoder lancado!!!");
            // consumo de energia
            this.energia -= this.superpoder.custoEnergia;
            // alvo recebendo dano, de quem mandar o superpoder
            alvo.receberDano(this.superpoder.dano);            alvo.vida -= this.superpoder.dano;
            return true;
        }
        else {
            System.out.println("Sem energia para o SuperPoder!");
            return false;
        }
    }

    void mostrarStatus(){
        System.out.println("---------------------------");
        System.out.println("Atributos do " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Energia: " + this.energia);
        System.out.println("---------------------------");

    }
}
