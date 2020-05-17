package com.dicoding.javafundamental.operator;

public class OperatorUnary {

    public static void main(String[] x) {
        System.out.println("Oprator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("hasil +5 = " +hasil);
        System.out.println();

        System.out.println("Oprator Unary Minus");
        int nilaiAwal2 = 5;
        int hasil2 = -nilaiAwal2;
        System.out.println("hasil -5 = " +hasil2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3); //6
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4); //4
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukses = false;
        System.out.println("Hasil !false =" + !sukses); //true
        System.out.println();
    }
}
