package paymentStrategy;

public class StripePaymentStrategy implements PaymentStrategy {
    private String apiKey;

    public StripePaymentStrategy(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe payment, amount = " + amount);
    }
}
