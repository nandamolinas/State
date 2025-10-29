public class Main {
    public static void main(String[] args) {
        System.out.println("--- Simulação 1: Fluxo Completo ---");
        Order order1 = new Order("A001"); // Estado: Novo

        order1.enviar();   // Ação inválida
        order1.pagar();    // Novo -> Pago
        order1.pagar();    // Ação inválida
        order1.enviar();   // Pago -> Enviado
        order1.cancelar(); // Ação inválida
        order1.entregar(); // Enviado -> Entregue
        order1.entregar(); // Ação inválida

        System.out.println("\nEstado final do Pedido #A001: " + order1.getState().getNome());

        System.out.println("\n--- Simulação 2: Fluxo de Cancelamento ---");
        Order order2 = new Order("B002"); // Estado: Novo

        order2.pagar();    // Novo -> Pago
        order2.cancelar(); // Pago -> Cancelado
        order2.enviar();   // Ação inválida

        System.out.println("\nEstado final do Pedido #B002: " + order2.getState().getNome());

        System.out.println("\n--- Simulação 3: Cancelamento Imediato ---");
        Order order3 = new Order("C003"); // Estado: Novo
        order3.cancelar(); // Novo -> Cancelado
        order3.pagar();    // Ação inválida

        System.out.println("\nEstado final do Pedido #C003: " + order3.getState().getNome());
    }
}