public class CanceledOrderState implements OrderState {

    @Override
    public void pagar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Pagamento não permitido — pedido cancelado.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Envio não permitido — pedido cancelado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: Entrega não permitida — pedido cancelado.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("AÇÃO INVÁLIDA: O pedido já se encontra cancelado.");
    }

    @Override
    public String getNome() {
        return "Cancelado";
    }
}