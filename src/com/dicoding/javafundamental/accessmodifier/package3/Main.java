package com.dicoding.javafundamental.accessmodifier.package3;

public class Main {
    public static void main(String[] x) {
        System.out.println("Nilai static variable : " + Perhitungan.nilai);

        for (int i=0; i<5; i++) {
            new Perhitungan();
        }

        System.out.println("Sampai " + Perhitungan.nilai);
        System.out.println("static method memiliki nilai " + Perhitungan.getNilai());
    }
}
