public class EmailNotifier implements Notifier {
        @Override
        public void notifyCustomer(Order order) {
            System.out.println("Enviando email al cliente " + order.getCustomerName() + " sobre su pedido.");
        }
}
