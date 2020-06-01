package com.dicoding.javafundamental.interfaces.notifikasi;

public class EmailNotification implements InterfaceNotification {

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim email ke " + receiver + " dengan isi : ");
        System.out.println(content);
    }
}
