package com.ylh.oop_exe.abstraction_interface.exe1;

public interface NotificationService {

    void send(String recipient, String message);
    boolean supports(String channelType);
}
