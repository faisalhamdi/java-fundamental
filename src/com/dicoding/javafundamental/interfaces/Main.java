package com.dicoding.javafundamental.interfaces;

import java.util.Scanner;

public class Main {

    public static void main(String[] x) {
        Phone redmiNote8 = new Xiaomi();
        PhoneUser redmy = new PhoneUser(redmiNote8);

        redmy.turnOnPhone();

        Scanner input  = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                redmy.turnOnPhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                redmy.turnOffPhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                redmy.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                redmy.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah");
            }
        }
    }
}
