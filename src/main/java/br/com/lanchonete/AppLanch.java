package br.com.lanchonete;

// CLASSE 4: AppLanch é a aplicação da lanchonete 
public class AppLanch {

    public static void main(String[] args) {

        // A aplicação só interage com o ControlePed
        ControlePed controle = new ControlePed();

        // SIMULAÇÃO DO USO
        controle.iniciarNovoPed();
        controle.addItmPed("Hamburguer", 25.50, 2);
        controle.addItmPed("Coca-Cola LT", 6.00, 3);
        controle.finalizarPed();

        // Segundo pedido
        controle.iniciarNovoPed();
        controle.addItmPed("Açaí G", 18.00, 1);
        controle.finalizarPed();

    }
}