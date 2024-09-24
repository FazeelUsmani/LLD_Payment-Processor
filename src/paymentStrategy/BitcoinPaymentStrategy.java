package paymentStrategy;

public class BitcoinPaymentStrategy implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPaymentStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paying via Bitcoin wallet = " + walletAddress + " for amount = " + amount);
    }
}
