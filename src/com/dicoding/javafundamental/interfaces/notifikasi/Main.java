package com.dicoding.javafundamental.interfaces.notifikasi;

public class Main {
    public static void main(String[] x) {
        String emailReciever = "fslhmd77@gmail.com";
        String noHp = "+62852343253";
        String mobilId = "android-12344";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotifif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Tutorial Polimorfisme sudah terbit di Petani Kode, " +
                "cek sekarang di https://www.petanikode.com/java-oop-polimorfisme";

        emailNotif.sendMessage(emailReciever, message);
        smsNotifif.sendMessage(noHp, message);
        pushNotif.sendMessage(mobilId, message);
    }
}
