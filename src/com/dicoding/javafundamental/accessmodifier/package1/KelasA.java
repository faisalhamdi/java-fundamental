package com.dicoding.javafundamental.accessmodifier;

public class KelasA {

    private int memberA = 5;
    char memberB = 'A';
    double memberC = 1.2;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        int hasil = functionA() + memberA;
        return hasil;
    }
}
