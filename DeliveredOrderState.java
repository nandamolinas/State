public class DeliveredOrderState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Pagamento não aplicável — pedido já entregue.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Envio não aplicável — o pedido já foi entregue.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já consta como entregue.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Pedido entregue — não pode ser cancelado. Inicie processo de devolução se necessário.");
    }

    @Override
    public String getNome() {
        return "Entregue";
    }
}