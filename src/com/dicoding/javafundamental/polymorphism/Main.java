package com.dicoding.javafundamental.polymorphism;

public class Main {
    public static void main(String[] x) {

        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(3);
        Segitiga segitiga = new Segitiga(3,4);
        Lingkaran lingkaran = new Lingkaran(21);

        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi : " + persegi.luas());
        System.out.println("Keliling persegi : " + persegi.keliling());
        System.out.println();
        System.out.println("Luas segitiga : " + segitiga.luas());
        System.out.println();
        System.out.println("Luas lingkaran : " + lingkaran.luas());
        System.out.println("Keliling lingkaran : " + lingkaran.keliling());
    }
}
