package paymentStrategy;

public class PaypalPaymentStrategy implements PaymentStrategy {
    private final String id;
    private String password;

    public PaypalPaymentStrategy(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal Payment id = " + id + " amount = " + amount);
    }
}
