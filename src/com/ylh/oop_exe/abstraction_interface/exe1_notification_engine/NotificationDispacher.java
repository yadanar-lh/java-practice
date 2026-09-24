package com.ylh.oop_exe.abstraction_interface.exe1_notification_engine;

import java.util.ArrayList;


public class NotificationDispacher {

    ArrayList<NotificationService> services;


    public NotificationDispacher(ArrayList<NotificationService> services) {
        this.services = services;
    }

    void dispatch(String recipient, String message, String channelType){
        int falseCount = 0;
        for(NotificationService service : services){
            if(service.supports(channelType)){
                service.send(recipient,message);
                break;
            } else {
                falseCount++;
            }
        }

        if(falseCount == services.toArray().length){
            System.out.println(channelType + " is not supported yet!");
        }

        if(channelType == null){
            throw new IllegalArgumentException("Channel Type is not supported!");
        }
    }
}
