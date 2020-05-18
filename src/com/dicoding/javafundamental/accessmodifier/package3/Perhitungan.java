package com.dicoding.javafundamental.accessmodifier.package3;

public class Perhitungan {
    public static int nilai = 3;
    static final double PI = 3.141;

    //static method
    protected static int getNilai() {
        return nilai;
    }

    Perhitungan() {
        nilai++;
    }

    void ubahNilai(){
        // Kode di bawah akan menampilkan error
        //PI = 3.1415;
    }
}
