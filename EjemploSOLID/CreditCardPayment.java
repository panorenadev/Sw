public class CreditCardPayment implements PaymentProcessor {
        @Override
        public void processPayment(Order order, double amount) {
            System.out.println("Procesando pago de $" + amount + " para el pedido " + order.getOrderId());
        }
}
