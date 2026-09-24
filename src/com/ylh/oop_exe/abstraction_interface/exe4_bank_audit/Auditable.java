package com.ylh.oop_exe.abstraction_interface.exe4_bank_audit;

public interface Auditable {
    String getAuditLog();
    void recordEvent(String event);
}
