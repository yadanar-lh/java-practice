package com.ylh.oop_exe.abstraction_interface.exe2_payment_gateway;

public interface Refundable {

    void refund(String transactionId, double amount);
}