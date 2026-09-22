package com.ylh.oop_exe.abstraction_interface.exe2;

public abstract class AbstractPaymentProcessor {
    protected String merchantId;
    protected String apiKey;

    public AbstractPaymentProcessor(String merchantId, String apiKey) {
        this.merchantId = merchantId;
        this.apiKey = apiKey;
    }

    public final boolean processPayment(double amount) {

        if(!validateRequest(amount)){
            System.out.println("Payment Failed: Invalid amount");
            return false;
        }

        if(!authenticate()){
            System.out.println("Payment Failed: Authentication Failed");
            return false;
        }

        boolean success = executeTransaction(amount);
        if(success){
            logTransaction(amount);
        } else {
            System.out.println("Execution Failed");
        }
        return success;
    }

    protected boolean validateRequest(double amount){
        return amount > 0;
    }

    protected void logTransaction(double amount){
        System.out.println("Processed Payment of $" + amount);
    }

    protected abstract boolean authenticate();
    protected abstract boolean executeTransaction(double amount);
}
