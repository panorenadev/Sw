public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "Juan Pérez") ;

        PaymentProcessor paymentProcessor = new CreditCardPayment();
        Notifier notifier = new EmailNotifier();
        OrderRepository orderRepository = new OrderRepository();

        OrderProcessor orderProcessor = new OrderProcessor(paymentProcessor, notifier, orderRepository);
        orderProcessor.process(order, 150.0); // Procesa el pedido con un monto de $150.0
    }
}