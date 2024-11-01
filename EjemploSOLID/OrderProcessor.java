public class OrderProcessor {
        private PaymentProcessor paymentProcessor;
        private Notifier notifier;
        private OrderRepository orderRepository;
    
        public OrderProcessor(PaymentProcessor paymentProcessor, Notifier notifier, OrderRepository orderRepository) {
            this.paymentProcessor = paymentProcessor;
            this.notifier = notifier;
            this.orderRepository = orderRepository;
        }
    
        public void process(Order order, double amount) {
            paymentProcessor.processPayment(order, amount); // Procesar pago
            orderRepository.save(order);                     // Guardar pedido
            notifier.notifyCustomer(order);                  // Notificar al cliente
        }
}
