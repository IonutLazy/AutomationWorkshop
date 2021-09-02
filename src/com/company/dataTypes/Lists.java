package com.company.dataTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Exista mai multe feluri de lists, noi o sa discutam despre 3 cele mai folosite: array, array list si map
 */
public class Lists {

    /**
     * Array
     * <p>
     * Se folosesc cand dorim sa stocam mai multe valori intr-o singura variabila
     * Se declara folosind parantezele patrate []
     * Accesam valorile stocate prin index
     */
    public static void exempleDeArray() {

        String[] masini = {"ford", "opel", "audi"};
        String[] cuvinte = "o propozitie cu mai multe cuvinte".split(" ");
        int numarulCuvintelor = cuvinte.length;
        String alDoileaCuvant = cuvinte[1];

        int[] numere = {1, 2};

        boolean[] booleanArray = {true, false};


    }

    /**
     * Array List
     * <p>
     * Ne putem gandi la Array List ca si la un Array care poate fi modificat(putem adauga valori, putem sterge valori)
     */
    public static void exempleDeArrayList() {

        List<String> listaDeCuvinte = new ArrayList<>();
        listaDeCuvinte.add("ceva text");
        listaDeCuvinte.add("alt text");
        listaDeCuvinte.set(0, "modificam primul index");
        listaDeCuvinte.contains("alt text");
        listaDeCuvinte.get(1);
        listaDeCuvinte.clear();

    }

    /**
     * Map
     * <p>
     * Un Map e o lista de tip cheie-valoare
     * nu poate sa contina decat o singura cheie de acelasi fel
     */
    public static void exempleDeMap() {

        HashMap<String, String> carCountry = new HashMap<>();
        carCountry.put("Audi", "German");
        carCountry.put("Skoda", "Czech");
        carCountry.get("Skoda");

        HashMap<String, List<String>> carModels = new HashMap<>();

        List<String> audiModels = new ArrayList<>();
        List<String> skodaModels = new ArrayList<>();

        audiModels.add("a4");
        audiModels.add("a5");
        audiModels.add("a6");
        audiModels.add("a7");

        skodaModels.add("fabia");
        skodaModels.add("octavia");

        carModels.put("Audi", audiModels);
        carModels.put("Skoda", skodaModels);

        carModels.get("Audi").contains("a3");
    }


    /**
     * Lectura suplimentara:
     *
     * https://www.w3schools.com/java/java_arrays.asp
     * https://www.w3schools.com/java/java_arraylist.asp
     * https://www.w3schools.com/java/java_hashmap.asp
     */
}
