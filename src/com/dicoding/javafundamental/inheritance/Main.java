package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] x) {
        Mamalia singa = new Kucing(); // penggunaan implement
        Hewan hewan = new Hewan();
        System.out.println("apakah hewan adalah Object -> " + (hewan instanceof Object));
        System.out.println("apakah hewan adalah Hewan -> " + (hewan instanceof Hewan));
        System.out.println("apakah hewan adalah Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("------------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("daging");

        System.out.println("------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println("------------------------");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("------------------------");

        System.out.println("meow equals puss? " + meow.equals(puss));
        System.out.println("meow equals popo? " + meow.equals(popo));

        System.out.println("------------------------");

        Object o = new Kucing(); // Kucing adalah object
        Hewan h = new Kucing(); // Kucing adalah hewan
        Kucing k = new Kucing(); // Kucing adalah kucing, so pasti

        // o.makan();
        h.makan();
        k.makan();

        System.out.println("------------------------");

        Object object = k; // bisa langsung diassign
        Hewan hewanK = k; // bisa langsung diassign

        // object.makan();
        hewanK.makan();

        Kucing kucingK = (Kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; // compile OK tapi runtime error ClassException
    }
}
