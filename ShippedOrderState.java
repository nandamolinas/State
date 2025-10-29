public class ShippedOrderState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Este pedido já foi pago e já está em trânsito.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Não é possível reenviar — o pedido já foi despachado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Registro: confirmação de entrega do pedido em andamento...");
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Cancelamento não permitido — pedido em trânsito.");
    }

    @Override
    public String getNome() {
        return "Enviado";
    }
}