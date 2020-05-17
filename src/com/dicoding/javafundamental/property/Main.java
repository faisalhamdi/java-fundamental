package com.dicoding.javafundamental.property;

public class Main {

    public static void main(String[] x) {
        Hewan harimau = new Hewan(50);
        harimau.lari();
        harimau.jalan();
        harimau.makan();

        System.out.println("Umur : " + harimau.getUmur());

        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = harimau.getBerat() / ((harimau.getTinggi() * 0.01) * (harimau.getTinggi() * 0.01));
        System.out.println("indeks massa tubuh : " + bmi);
    }
}
