package com.ylh.oop_exe.abstraction_interface.exe2_payment_gateway;

public class StripePaymentProcessor extends AbstractPaymentProcessor implements Refundable{
    public StripePaymentProcessor(String merchantId, String apiKey) {
        super(merchantId, apiKey);
    }

    @Override
    protected boolean authenticate() {
        System.out.println("Authentication with Stripe to " + merchantId + " Api key: " + apiKey);
        return true;
    }

    @Override
    protected boolean executeTransaction(double amount) {
        System.out.println("Stripe Payment Transaction : $ " + amount);
        return true;
    }

    @Override
    public void refund(String transactionId, double amount) {
        System.out.println("Refunding to " + transactionId + " Amount : $" + amount);
    }
}
