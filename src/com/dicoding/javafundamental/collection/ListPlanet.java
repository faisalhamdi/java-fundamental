package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] x) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "rikardo";
        // heroes[2] = "zeus"; //error ArrayIndexOfBoundsException karena ukuran array tetap

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planet awal :");
        for (int i=0; i<planets.size(); i++) { // method size() untuk mendapatkan ukuran List
            System.out.println("\t index-"+ i +" = " + planets.get(i)); // method get() untuk melihat isi List pada index i
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari List

        System.out.println();
        System.out.println("List planet akhir :");
        for (int i=0; i<planets.size(); i++) {
            System.out.println("\t index-"+ i +" = "+ planets.get(i));
        }
    }
}
