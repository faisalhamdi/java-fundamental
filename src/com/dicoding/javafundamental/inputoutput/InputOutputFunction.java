package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlaha Sederhana");
        System.out.print("Masukkan Angka pertama : ");
        int value1 = scanner.nextInt();
        System.out.print("Masukkan Angka kedua : ");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : " +hasil);
    }
}
