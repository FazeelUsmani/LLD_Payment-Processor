public class PaymentProcessor {
    // Old Payment Processor
    public void processCreditCardPayment(String cardNum, String expiryDate, String cvv, Double amount) {
        System.out.println("In processCreditCardPayment");
    }

    public void processStripePayement(String apiKey, Double amount) {
        System.out.println("In processStripePayement");
    }

    public void processPaypalPayment(String email, String password, Double amount) {
        System.out.println("In processPaypalPayment");
    }
}
