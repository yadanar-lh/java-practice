package com.ylh.oop_exe.abstraction_interface.exe1_notification_engine;

public class PushNotificationService implements NotificationService{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending Push to " + recipient + ": " + message);
    }

    @Override
    public boolean supports(String channelType) {
        return channelType.equalsIgnoreCase("Push");
    }
}
