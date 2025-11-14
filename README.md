O sistema simula o cadastro simples de pedidos de uma lanchonete.

## Padrões GRASP Utilizados e Justificativas

Conforme pedido, aplicamos dois padrões GRASP principais para garantir um código mais organizado e fácil de manter.

Escolhemos Controller e Creator porque são os padrões ideais para estruturar a entrada de dados e a criação de objetos em um sistema simples, como o de pedidos.

Em resumo, Controller e Creator formam o esqueleto funcional de um sistema de software, os fazendo ser a dupla mais lógica e direta para o exercício prático.

### 1. Creator

O que fazemos: Definimos qual classe deve criar as instâncias de outras classes.

Onde foi aplicado:
Classe: `ControlePed.java` (no método `iniciarNovoPed`).
Justificativa:A classe `ControlePed` é quem manda no processo de pedido e sabe quando um novo pedido precisa começar (e qual é o próximo ID). Por isso, ela é a mais indicada para criar o objeto `Ped` (Pedido).

### 2. Controller

O que fizemos: Definimos qual classe recebe as ações de quem usa o sistema e coordena o que precisa ser feito.

Onde foi aplicado:
Classe: `ControlePed.java` (como um todo).
Justificativa: Esta classe funciona como a mesa de controle. Ela recebe o comando da interface (`AppLanch`) para, por exemplo, adicionar um item, e repassa essa tarefa para a classe correta (`Ped`), sem fazer a lógica toda sozinha.

## Estrutura do Código

O código está organizado seguindo a estrutura padrão de projetos Java. O ponto de entrada do sistema é a classe `AppLanch.java`.

Arquivos principais:

* `ItemPed.java`: Representa o item do menu (lanche, bebida, etc.).
* `Ped.java`: Representa o pedido em si (lista de itens e cálculo do total).
* `ControlePed.java`: O Controlador do sistema que gerencia o fluxo de pedidos (Controller e Creator).
* `AppLanch.java`: Onde o programa começa (simula o uso do sistema).