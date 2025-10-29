public class PaidOrderState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível pagar — o pedido já está quitado.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Preparando e despachando o pedido...");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void entregar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Entrega não possível — pedido ainda não foi despachado.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Cancelando pedido pago. Iniciando processo de estorno...");
        order.setState(new CanceledOrderState());
    }

    @Override
    public String getNome() {
        return "Pago";
    }
}