package com.dicoding.javafundamental.interfaces.notifikasi;

public class PushNotification implements InterfaceNotification {

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim Push Notif ke " + receiver + " dengan content");
        System.out.println(content);
    }
}
