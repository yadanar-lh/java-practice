package com.ylh.oop_exe.abstraction_interface.exe1;

import java.util.ArrayList;

public class Test {
    static void main() {
        ArrayList<NotificationService> services = new ArrayList<>();
        services.add(new EmailNotificationService());
        services.add(new SmsNotificationService());
        services.add(new PushNotificationService());

        NotificationDispacher dispatcher = new NotificationDispacher(services);
        dispatcher.dispatch("alice@example.com", "Your OTP is 4829", "EMAIL");
        dispatcher.dispatch("+1234567890", "Your OTP is 4829", "SMS");
        dispatcher.dispatch("user_123", "Your OTP is 4829", "PUSH");

        // Test unsupported channel
        dispatcher.dispatch("user_123", "Your OTP is 4829", "WHATSAPP");



    }
}
