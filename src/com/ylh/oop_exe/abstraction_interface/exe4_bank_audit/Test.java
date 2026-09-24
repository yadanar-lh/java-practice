package com.ylh.oop_exe.abstraction_interface.exe4_bank_audit;

import java.sql.SQLOutput;

public class Test {
    static void main() {
        SavingsAccount saving = new SavingsAccount("234923823242423");
        CheckingAccount checking = new CheckingAccount("234923823242423");


        saving.deposit(1000);
        saving.withdraw(200);
        saving.applyInterest();

        checking.deposit(200);
        checking.withdraw(3000);

        System.out.println("\n===== SAVING AUDIT LOGS ====");
        System.out.println(saving.getAuditLog());

        System.out.println("\n===== CHECKING AUDIT LOGS ====");
        System.out.println(checking.getAuditLog());


    }
}
