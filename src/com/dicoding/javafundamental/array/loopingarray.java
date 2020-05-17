package com.dicoding.javafundamental.array;

public class loopingarray {

    public static void main(String[] x) {
        int[] arrInt = new int[100];

        for (int i=0; i<arrInt.length; i++) {
            arrInt[i] = i + 1;
            System.out.println("array ke - "+ arrInt[i]);
        }
    }
}
