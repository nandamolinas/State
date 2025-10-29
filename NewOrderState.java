public class NewOrderState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("Iniciando processamento do pagamento...");
        order.setState(new PaidOrderState());
    }

    @Override
    public void enviar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: O pedido ainda não foi pago; não pode ser enviado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Entrega não permitida — pagamento pendente.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Cancelando pedido no estado 'Novo'...");
        order.setState(new CanceledOrderState());
    }

    @Override
    public String getNome() {
        return "Novo";
    }
}