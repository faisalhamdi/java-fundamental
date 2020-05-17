package com.dicoding.javafundamental.function;

public class MethodOverloading {

    public static void main(String[] x) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l);
        System.out.println("hasil adalah : " + hasil);

        int pn = 3;
        int lb = 4;
        int hsl = hitungLuas(pn, lb);
        System.out.println("hsl adalah : " + hsl);
    }

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
