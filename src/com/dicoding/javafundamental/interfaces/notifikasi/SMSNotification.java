package com.dicoding.javafundamental.interfaces.notifikasi;

public class SMSNotification implements InterfaceNotification {

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan content");
        System.out.println(content);
    }

}
