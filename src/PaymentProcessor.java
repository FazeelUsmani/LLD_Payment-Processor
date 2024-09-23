public class PaymentProcessor {
    public void processCreditCardPayment(String cardNum, String expiryDate, String cvv, Double amount) {
        System.out.println("In processCreditCardPayment");
    }

    public void processStripePayement(String apiKey, Double amount) {
        System.out.println("In processStripePayement");
    }

    public void processPaypalPayment(String apiKey, Double amount) {
        System.out.println("In processPaypalPayment");
    }
}
