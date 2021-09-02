package com.company.dataTypes;


/**
 * Testele pe care le vom scrie vor avea nevoie sa stocheze anumite date la nivel de cod (ex. textul de pe un field, numarul de optiuni dintr-o lista, etc).
 * Pentru a putea face asta, apelam la VARIABILE (ne putem gandi la ele ca un container in care tinem informatie)
 * Fiecare variabila are un TIP, care trebuie declarat
 * Variabilele pot fi: - primitive: char, byte, short, int, long, float, double, boolean
 *                     - non-primitive: String, Arrays, Classes
 */
public class DataTypes {


    /**
     * char
     * <p>
     * reprezinta un singur caracter
     */
    public static void exempleDeChar() {
        char litera = 'b';
        char uniChar = '\u0021';

        System.out.println("char = " + uniChar);

    }

    /**
     * String
     * <p>
     * Un String e o colectie de char-uri
     */
    public static void exempleDeString() {

        String example = "the brown fox jumps over the lazy dog";

        //Exista mai multe metode pe care le putem apela pe un String:

        //ca sa aflam cat de lung e:
        System.out.println("Stringul are o lungime de " + example.length());

        //putem afla si ce caracter se afla la un index anume (primul caracter e index 0)
        System.out.println("Caracterul de la index 0: " + example.charAt(0));
        System.out.println("Caracterul de la index 2: " + example.charAt(2));

        //sau la ce index incepe o fraza
        System.out.println(example.indexOf("fox"));

        //putem concatena (lipi) mai multe stringuri
        String primulString = "the brown fox";
        String alDoileaString = "jumps";
        String alTreileaString = "over the lazy dog";
        System.out.println(primulString + " " + alDoileaString + " " + alTreileaString);

        //sau sa impartim un string in functie de ce dorim:
        //dupa spatiu
        String[] cuvinte = example.split(" ");
        for (String cuvant : cuvinte) {
            System.out.println(cuvant);
        }

        //dupa un cuvant sau serie anume de caractere:
        String[] fraze = example.split("jumps");
        for (String fraza : fraze) {
            System.out.println(fraza);
        }

        //sau putem curata un String de spatiu mort (spatiu ca prim caracter sau ca ultim caracter)
        String spatiiInutile = "    spatii inutile    ";
        System.out.println(spatiiInutile.trim());

        //putem de asemenea sa inlaturam caracterele care nu ne intereseaza:
        String diacritice = "a,b,c,d,e";
        System.out.println(diacritice.replace(",", ""));
    }


    /**
     * Integer
     * <p>
     * poate stoca numere intregi
     */
    public static void exempleDeInt() {

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println((a * b) - c);


        String ab = "14";
        int xyz = Integer.parseInt(ab);

        String cd = String.valueOf(xyz);

    }


    /**
     * Float
     * <p>
     * poate stoca numere cu decimale
     */
    public static void exempleDeFloat() {

        float a = 10f;
        float b = 5.5f;

        int c = (int) b;

        System.out.println(a + b);
        System.out.println(c);
    }

    /**
     * Boolean
     * <p>
     * poate fi doar TRUE sau FALSE
     */
    public static void exempleDeBoolean() {

        boolean a = true;
        boolean b = false;

    }

    /**
     * Lectura suplimentara:
     *
     * https://www.w3schools.com/java/java_data_types.asp
     * https://www.w3schools.com/java/java_strings.asp
     * https://www.javatpoint.com/java-data-types
     */
}
