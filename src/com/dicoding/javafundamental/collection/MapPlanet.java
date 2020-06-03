package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {

    public static void main(String[] x) {
        // menggunakan HashMap
        Map<String, Planet> planets = new HashMap<>();
        planets.put("key-1", new Planet("Mercury", 0.06));
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-2", new Planet("Eart", 1.00)); //key duplicate
        planets.put("key-3", new Planet("Mars", 0.5));

        System.out.println("Map planet awal: (size: " + planets.size() + ")");
        for (String key : planets.keySet()) {
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        System.out.println();
        planets.remove("key-2");

        System.out.println("Map planet akhir: (size: " + planets.size() + ")");
        for (Planet planet : planets.values()) { // looping value dari Map
            System.out.println("\t " + planet);
        }
     }
}
