package com.ylh.oop_exe.abstraction_interface.exe2_payment_gateway;

public class CryptoPaymentProcessor extends AbstractPaymentProcessor{
    public CryptoPaymentProcessor(String merchantId, String apiKey) {
        super(merchantId, apiKey);
    }

    @Override
    protected boolean authenticate() {
        System.out.println("Authentication with Crypto to " + merchantId + " Api key: " + apiKey);
        return true;
    }

    @Override
    protected boolean executeTransaction(double amount) {
        System.out.println("Executing Transaction : $" + amount);
        return true;
    }
}
