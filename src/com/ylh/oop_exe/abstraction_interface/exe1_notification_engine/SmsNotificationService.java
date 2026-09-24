package com.ylh.oop_exe.abstraction_interface.exe1_notification_engine;

public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    @Override
    public boolean supports(String channelType) {
        return channelType.equalsIgnoreCase("SMS");
    }
}
