package org.fasttrack.curs8.Exercise1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Electronics casetofon = new Electronics(200.2, "casetofon", "marca japoneza", 92, "muzical");

        casetofon.setLength(20.8);
        casetofon.setHeight(5.9);
        casetofon.setWidth(5);
        casetofon.setWeight(5.6);


        System.out.println(String.format("Produsul de tip %s cu numele %s exista in stoc %d bucati, la pretul %f pe buc.", casetofon.getType(), casetofon.getName(), casetofon.getQuantity(), casetofon.getPrice()));
        System.out.println(String.format("Produsul are urmatoarele specificatii: lungime %f, inaltime %f, latime %f, greutate %f",
                casetofon.getLength(), casetofon.getHeight(), casetofon.getWidth(), casetofon.getWeight()));

        casetofon.utilizareProdus();
        casetofon.utilizareProdus("electronic");


        // definesc obiect de tip Cosmetics
        Cosmetics ruj = new Cosmetics(2.4, "ruj", "cosmetice", 22, "rosu", 0.2);


        System.out.println(String.format("Produsul %s din gama %s exista %d buc in stoc, la pret de %f , culoarea este %s si greutatea %f",
                ruj.getName(), ruj.getDescription(), ruj.getQuantity(), ruj.getPrice(), ruj.getColor(), ruj.getWeight()));

        ruj.utilizareProdus("cosmetice");

        //definesc un obiect de tip Fridge

        Fridge congelator = new Fridge(4000, "congelator", "produs electrocasnic", 33, "frigorific", 2);
        System.out.println(String.format("Produsul %s din gama %s exista %d buc in stoc, la pret de %f , temperatura medie  %f grade Celsius",
                congelator.getName(), congelator.getType(), congelator.getQuantity(), congelator.getPrice(), congelator.getTemperature()));

        // String rezultat = congelator.utilizareProdus("electrocasnic");
        //System.out.println("Produsul " + congelator.getName() + " este " + congelator.utilizareProdus("electrocasnic"));
        congelator.utilizareProdus("electrocasnic");

        congelator.incarcareStoc(10);
        ruj.incarcareStoc(100);



    }
}
