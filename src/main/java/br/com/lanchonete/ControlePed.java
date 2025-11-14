package br.com.lanchonete;

// CLASSE 3: ControlePed é o Controle de Pedidos
// GRASP: Controller
class ControlePed {
    private int proxIdPed = 1;
    private Ped pedAtual;

    // GRASP: Creator o ControlePed cria o Pedido
    public Ped iniciarNovoPed() {
        System.out.println("\nIniciando novo pedido");
        this.pedAtual = new Ped(proxIdPed++); // Cria a instância de Pedido
        return this.pedAtual;
    }

    public void addItmPed(String nome, double preco, int qtd) {
        if (pedAtual == null) {
            System.out.println("Erro! Inicie um pedido primeiro");
            return;
        }
        ItemPed novoItem = new ItemPed(nome, preco, qtd);
        pedAtual.addItm(novoItem); // Delega a responsabilidade de guardar o item para o Ped
        System.out.println("Item '" + nome + "' adicionado");
    }

    public void finalizarPed() {
        if (pedAtual != null) {
            System.out.println("\nFinalizando o pedido");
            pedAtual.exibirPed();
            this.pedAtual = null;
        } else {
             System.out.println("Não há pedido ativo para finalizar");
        }
    }
}