package com.dumai.FacteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public FacteursPremiers(){}
    public List<Integer> generer(int nombre){
        List<Integer> liste = new ArrayList<>();
        if(nombre <= 1){
            return liste;
        }
        while (nombre % 2 == 0) {
            liste.add(2);
            nombre /= 2;
        }
        // Diviser par les nombres impairs
        for (int i = 3; i <= Math.sqrt(nombre); i += 2) {
            while (nombre % i == 0) {
                liste.add(i);
                nombre /= i;
            }
        }

        // Si n > 2, alors c’est un facteur premier restant
        if (nombre > 2) {
            liste.add(nombre);
        }
        return liste;
    }
}
