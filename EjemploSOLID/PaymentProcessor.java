public interface PaymentProcessor {
    void processPayment(Order order, double amount);
} 

