import paymentStrategy.*;

public class Main {
    public static void main(String[] args) {
//        Old PaymentProcessor
//        PaymentProcessor paymentProcessor = new PaymentProcessor();
//        paymentProcessor.processCreditCardPayment("123456", "05/2029", "571", 2515.35);
//        paymentProcessor.processPaypalPayment("abc123", "abc", 22.10);
//        paymentProcessor.processStripePayement("qwe123", 9865.32);

        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy("1234", "351", "25/09");
        PaymentProcessorUsingStrategyPattern paymentProcessorUsingStrategyPattern = new PaymentProcessorUsingStrategyPattern(creditCardPaymentStrategy);
        paymentProcessorUsingStrategyPattern.processPayment(50);

        PaypalPaymentStrategy paypalPaymentStrategy = new PaypalPaymentStrategy("85", "asbd");
        paymentProcessorUsingStrategyPattern.setPaymentStrategy(paypalPaymentStrategy);
        paymentProcessorUsingStrategyPattern.processPayment(150);

        StripePaymentStrategy stripePaymentStrategy = new StripePaymentStrategy("asdfl;kj2343l24jkadsf");
        paymentProcessorUsingStrategyPattern.setPaymentStrategy(stripePaymentStrategy);
        paymentProcessorUsingStrategyPattern.processPayment(200);

        BitcoinPaymentStrategy bitcoinPaymentStrategy = new BitcoinPaymentStrategy("my_wallet_address");
        paymentProcessorUsingStrategyPattern.setPaymentStrategy(bitcoinPaymentStrategy);
        paymentProcessorUsingStrategyPattern.processPayment(25_000);

    }
}