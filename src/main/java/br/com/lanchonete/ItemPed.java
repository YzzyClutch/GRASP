package br.com.lanchonete;

// CLASSE 1: ItemPed é o Item de Pedido
class ItemPed {
    private String nome;
    private double preco;
    private int qtd;

    public ItemPed(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double getSubTotal() {
        return preco * qtd;
    }

    @Override
    public String toString() {
        return qtd + "x " + nome + " (R$" + String.format("%.2f", preco) + ")";
    }
}