package com.ylh.oop_exe.abstraction_interface.exe4_bank_audit;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements Auditable{
    protected String accountNumber;
    protected double balance;
    private List<String> auditLogs = new ArrayList<>();

    @Override
    public String getAuditLog(){
        return String.join("\n", auditLogs);
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void recordEvent(String event){
        auditLogs.add(event);
    }

    void deposit(double amount) {
        if(amount > 0){
            System.out.println("$" + amount + " is added to " + accountNumber );
            balance += amount;
            recordEvent("Deposited $" + amount + " | New Balance $" + balance);
        }
    }

    abstract void withdraw(double amount);
}
