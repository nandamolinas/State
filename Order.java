public class Order {
    private OrderState currentState;
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
        this.currentState = new NewOrderState();
        System.out.println("Pedido #" + orderId + " criado. Estado: " + currentState.getNome());
    }

    public void setState(OrderState newState) {
        this.currentState = newState;
        System.out.println("Pedido #" + orderId + " mudou para o estado: " + currentState.getNome());
    }

    public OrderState getState() {
        return this.currentState;
    }

    public void pagar() {
        currentState.pagar(this);
    }

    public void enviar() {
        currentState.enviar(this);
    }

    public void entregar() {
        currentState.entregar(this);
    }

    public void cancelar() {
        currentState.cancelar(this);
    }
}