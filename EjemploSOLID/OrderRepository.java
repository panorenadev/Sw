public class OrderRepository {
        public void save(Order order) {
            System.out.println("Guardando el pedido " + order.getOrderId() + " en la base de datos.");
        }
}
