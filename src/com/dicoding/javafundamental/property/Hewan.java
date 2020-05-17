package com.dicoding.javafundamental.property;

public class Hewan {

    // Properti atau fields
    // Inisiasi dengan nilai inisial
    double tinggi = 17.5;
    double berat = 125.7;
    // Inisiasi melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Hewan(int umurParam) {
        this.umur = umurParam;
    }

    void lari() {
        System.out.println("Berlari sangat cepat.");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan.");
    }

    void makan() {
        System.out.println("Makan menggunakan mulut.");
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public int getUmur() {
        return umur;
    }
}
