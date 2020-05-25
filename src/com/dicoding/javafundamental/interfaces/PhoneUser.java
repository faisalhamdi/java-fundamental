package com.dicoding.javafundamental.interfaces;

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void turnOnPhone() {
        this.phone.powerOn();
    }

    void turnOffPhone() {
        this.phone.powerOff();
    }

    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}
