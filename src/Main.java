public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processCreditCardPayment("123456", "05/2029", "571", 2515.35);
        paymentProcessor.processPaypalPayment("abc123", 22.10);
        paymentProcessor.processStripePayement("qwe123", 9865.32);
    }
}