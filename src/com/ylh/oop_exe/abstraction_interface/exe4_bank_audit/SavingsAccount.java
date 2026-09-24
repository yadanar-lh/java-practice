package com.ylh.oop_exe.abstraction_interface.exe4_bank_audit;

import java.util.regex.Pattern;

public class SavingsAccount extends BankAccount implements InterestBearing{
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }


    @Override
    void withdraw(double amount) {
        if(amount < balance){
            balance -= amount;
            System.out.println("Balance Left : $" + balance);
            recordEvent("Withdrew $" + amount + " | New Balance $" + balance);
        } else {
            recordEvent("FAILED Withdrawal attempt of $" + amount);
        }
    }

    @Override
    public void applyInterest() {
        double interestYearly = balance * 0.0037;
        balance += interestYearly;
        recordEvent("Interest Yearly $" + interestYearly + " | New Balance $"+balance);
    }
}
