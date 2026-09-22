package com.ylh.oop_exe.abstraction_interface.exe2;

public class Test {

    static void main() {
        StripePaymentProcessor stripe = new StripePaymentProcessor("1001", "user001");
        CryptoPaymentProcessor crypto = new CryptoPaymentProcessor("1001", "user001");


        stripe.processPayment(2000);
        stripe.refund("0002", 500);

        crypto.processPayment(3000);

    }
}
