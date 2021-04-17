package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly", 2.5, 2, true));
        stamps.add(new Stamp("Dog", 2.7, 2.4, false));
        stamps.add(new Stamp("Festival", 3, 2.8, false));
        stamps.add(new Stamp("Festival", 3, 2.8, false));
        stamps.add(new Stamp("Anniversary of the Ghetto Uprising", 2, 1.7, true));
        stamps.add(new Stamp("Anniversary of the Ghetto Uprising", 2, 1.7, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

