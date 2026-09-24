package com.ylh.oop_exe.abstraction_interface.exe4_bank_audit;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    void withdraw(double amount) {
        double overdraftLimit = balance + 100;
        if (amount < overdraftLimit) {
            balance -= amount;
            System.out.println("Successfully withdraw $" + amount);
            System.out.println("Balance Left: $" + balance);
            recordEvent("Withdrew $" + amount + " | New Balance $" + balance);
        } else {
            recordEvent("FAILED Withdrawal attempt of $" + amount);
            System.out.println("Invalid Amount.");
        }

    }
}
