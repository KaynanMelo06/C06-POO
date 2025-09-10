import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

public class Main{
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Pedro");
        cliente.setCpf(1231231231);

        Conta conta = new Conta();

        //Setando o cliente na conta
        conta.setClientes(cliente);


    }
}