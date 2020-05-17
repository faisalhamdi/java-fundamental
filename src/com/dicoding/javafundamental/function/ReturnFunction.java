package com.dicoding.javafundamental.function;

public class ReturnFunction {

    public static void main(String[] x) {
            double p = 7;
            double l = 6.5;
            double L = hitungLuas(p,l);

        System.out.println("Luas persegi adalah : " + L);
    }

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
