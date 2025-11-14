package br.com.lanchonete;

import java.util.ArrayList;
import java.util.List;

// CLASSE 2: Ped é o Pedido
class Ped {
    private int id;
    private List<ItemPed> itens;

    public Ped(int id) {
        this.id = id;
        this.itens = new ArrayList<>();
        //Responsabilidade de gerenciar itens e total é DESSA classe
    }

    // Método para adicionar itens ao pedido
    public void addItm(ItemPed item) {
        this.itens.add(item);
    }

    public double getVlrTotal() {
        double total = 0;
        for (ItemPed item : itens) {
            total += item.getSubTotal();
        }
        return total;
    }

    public void exibirPed() {
        System.out.println("\n--- PEDIDO #" + id + " ---");
        if (itens.isEmpty()) {
            System.out.println("O pedido está vazio.");
            return;
        }
        for (ItemPed item : itens) {
            System.out.println(" - " + item);
        }
        System.out.println("TOTAL GERAL: R$" + String.format("%.2f", getVlrTotal()));
        System.out.println("-------------------------");
    }
}