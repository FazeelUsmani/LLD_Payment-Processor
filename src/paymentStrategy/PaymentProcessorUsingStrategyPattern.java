package paymentStrategy;

public class PaymentProcessorUsingStrategyPattern {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessorUsingStrategyPattern(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
