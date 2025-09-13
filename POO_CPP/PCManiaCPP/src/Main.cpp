#include <iostream>
#include <vector>
#include <string>

// Incluir os cabeçalhos de todas as suas classes
#include "Computador/Computador.h"
#include "Computador/HardwareBasico.h"
#include "Computador/MemoriaUSB.h"
#include "Computador/SistemaOperacional.h"
#include "Cliente/Cliente.h"

// Usar o namespace std para simplificar (cout, cin, string, vector)
using namespace std;

int main(){
    int matricula = 2197;

    //Hardware basicos
    //Processador
    HardwareBasico processador1("Pentium Core i3", 2200);
    HardwareBasico processador2("Pentium Core i5", 3370);
    HardwareBasico processador3("Pentium Core i7", 4500);

    //Memoria RAM
    HardwareBasico memoriaRam1("Memoria RAM", 8);
    HardwareBasico memoriaRam2("Memoria RAM", 16);
    HardwareBasico memoriaRam3("Memoria RAM", 32);
    
    //Armazenamento
    HardwareBasico HD1("HD", 500);
    HardwareBasico HD2("HD", 1000);
    HardwareBasico HD3("HD", 2000);

    //Sistemas Operacionais
    //SistemaOperacional1
    SistemaOperacional sistemaOperacional1;
    sistemaOperacional1.setNome("MacOS Sequoia");
    sistemaOperacional1.setTipo(64);
    //SistemaOperacional2
    SistemaOperacional sistemaOperacional2;
    sistemaOperacional2.setNome("Windows 8");
    sistemaOperacional2.setTipo(64);
    //SistemaOperacional3
    SistemaOperacional sistemaOperacional3;
    sistemaOperacional3.setNome("Windows 10");
    sistemaOperacional3.setTipo(64);

    //Memorias USB
    //penDrive 1
    MemoriaUSB penDrive1;
    penDrive1.setNome("penDrive");
    penDrive1.setCapacidade(16);
    //penDrive 2
    MemoriaUSB penDrive2;
    penDrive2.setNome("penDrive");
    penDrive2.setCapacidade(32);
    //HDExterno
    MemoriaUSB HDExterno1;
    HDExterno1.setNome("HD Externo");
    HDExterno1.setCapacidade(1000);

    //Computadores das promocoes montados
    //Promocao 1
    vector<HardwareBasico> hardwarePromocao1 {processador1, memoriaRam1, HD1};
    Computador promocao1("Apple", matricula, hardwarePromocao1, sistemaOperacional1);
    promocao1.addMemoriaUSB(penDrive1);
    //Promocao 2
    vector<HardwareBasico> hardwarePromocao2 {processador2, memoriaRam2, HD2};
    Computador promocao2("Samsung",matricula + 1234 , hardwarePromocao2, sistemaOperacional2);
    promocao2.addMemoriaUSB(penDrive2);
    //Promocao 3
    vector<HardwareBasico> hardwarePromocao3 {processador3, memoriaRam3, HD3};
    Computador promocao3("Dell", matricula + 5678, hardwarePromocao3, sistemaOperacional3);
    promocao3.addMemoriaUSB(HDExterno1);

    //Clientes
    vector<Cliente> clientes;
    int codigo;
    string nomeCliente;
    string cpfCliente;

    //Interface Grafica
    cout << "Bem vindo a loja PCMania!" << endl;
    cout << endl;

    //Cadastro
    while (true){
        cout << "Deseja realizar um novo cadastro?" << endl;
        cout << "1 - SIM" << endl;
        cout << "2 - NAO (Ir para as compras)" << endl;
        cin >> codigo;
        
        if (codigo == 1){
            cout << "Vamos fazer seu cadastro:" << endl;
            cout << "Digite seu nome: ";
            cin >> nomeCliente;
            cout << "Digite seu CPF: ";
            cin >> cpfCliente;
            
            // CORREÇÃO: Cria um novo cliente e adiciona ao final do vetor 'clientes'
            Cliente novoCliente(nomeCliente, cpfCliente);
            clientes.push_back(novoCliente);
            
            cout << "Cliente cadastrado com sucesso!" << endl;
        } else if(codigo == 2){
            cout << "Cadastro finalizado. Vamos para as compras!" << endl;
            break;
        } else {
            cout << "Opcao invalida!" << endl;
        }
    }

    if (clientes.empty()){ // .empty() é uma forma mais clara de verificar se o vetor está vazio
        cout << "Nenhum cliente cadastrado!" << endl;
        return 0;
    }
 
    //login
    Cliente* clienteLogado = nullptr;
    while (clienteLogado == nullptr){
        cout << "Por favor, digite seu CPF para continuar: ";
        string cpfLogin;
        cin >> cpfLogin;

        for (size_t i = 0; i < clientes.size(); i++){
            if (clientes.at(i).getCpf() == cpfLogin){
                clienteLogado = &clientes.at(i);
                break;
            }
        }

        if (clienteLogado == nullptr){
            cout << "CPF nao encontrado. Tente novamente!" << endl;
        }
    }

    cout << "Login realizado com sucesso! Bem-vindo(a), " << clienteLogado->getNome() << "!" << endl;

    //compra dos pcs
    int codigoCompra;
    vector<Computador> computadoresComprados;

    do {
        cout << "\nDigite o codigo de qual computador deseja comprar!" << endl;
        cout << "1 - PC Promocao 1" << endl;
        promocao1.mostraPCConfigs();
        cout << "2 - PC Promocao 2" << endl;
        promocao2.mostraPCConfigs();
        cout << "3 - PC Promocao 3" << endl;
        promocao3.mostraPCConfigs();
        cout << "Caso deseje sair, digite 0!" << endl;
        cout << "Codigo: ";
        cin >> codigoCompra;
        
        if (codigoCompra == 0){
            break;
        }

        switch (codigoCompra) {
            case 1:
                cout << clienteLogado->getNome() << " esta comprando o computador da promocao 1" << endl;
                // CORREÇÃO: Adiciona o computador ao final do vetor 'computadoresComprados'
                computadoresComprados.push_back(promocao1);
                break;
            case 2:
                cout << clienteLogado->getNome() << " esta comprando o computador da promocao 2" << endl;
                computadoresComprados.push_back(promocao2);
                break;
            case 3:
                cout << clienteLogado->getNome() << " esta comprando o computador da promocao 3" << endl;
                computadoresComprados.push_back(promocao3);
                break;
            default:
                cout << "Codigo nao existe, tente novamente!" << endl;
                break;
        }
    } while (true); // O 'break' interno já controla a saída do loop

    cout << "\nSeu carrinho de compras: " << endl;
    cout << "Suas informacoes:" << endl;
    cout << "Cliente: " << clienteLogado->getNome() << endl;
    cout << "CPF: " << clienteLogado->getCpf() << endl;
    cout << "----------------------------------------------" << endl;

    // CORREÇÃO: Percorre o vetor usando o seu tamanho real (.size())
    for (size_t i = 0 ; i < computadoresComprados.size(); i++){
        computadoresComprados.at(i).mostraPCConfigs();
    }

    clienteLogado->setComputadores(computadoresComprados);

    cout << "Preco total do seu carrinho: R$" << clienteLogado->calculaTotalCompra() << endl;
    cout << "Obrigado pela visita, " << clienteLogado->getNome() << ". Saindo..." << endl;

    return 0;
}