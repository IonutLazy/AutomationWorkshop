package com.company.dataTypes;

public class Flow {

    // IF, FOR, WHILE, SWITCH


    public static void flowExamples() {


        // IF
        // OR ||  AND  &&
        boolean conditie = true;
        int a = 5;
        int b = 10;

        if (conditie) {
            System.out.println("do something");
        }

        if (a == b && conditie) {
            System.out.println("ajung aici?");
        }

        if (a == b) {
            System.out.println("cazul 1");
        } else if (a < b) {
            System.out.println("cazul 2");
        } else {
            System.out.println("nu e acoperit de nici un if");
        }


        //FOR

        for (int i = 0; i < 10; i++) {

        }

        String[] masini = {"ford", "opel", "audi"};

        for (String masina : masini) {
            if (masina.startsWith("f")) {
                System.out.println(masina);
            }
        }


        //WHILE

//        while (conditie) {
//            System.out.println("");
//        }
//
//
//        do {
//            System.out.println("ceva");
//        } while (conditie);


        String cuvinte = "abcdefcasd asdkjsa daolsd m ljkalsd; poajksd lkamjsd ipuaspdho a;ld ";

        while (cuvinte.length() > 50) {
            cuvinte = cuvinte.substring(1);
        }


        //SWITCH

        int zi = 3;
        switch (zi) {
            case 1:
                System.out.println("luni");
                break;

            case 2:
                System.out.println("marti");
                break;

            case 3:
                System.out.println("miercuri");
                break;
        }


    }
}



/**
 * Lectura suplimentara:
 *
 * https://www.w3schools.com/java/java_conditions.asp
 * https://www.w3schools.com/java/java_switch.asp
 * https://www.w3schools.com/java/java_while_loop.asp
 * https://www.w3schools.com/java/java_for_loop.asp
 * https://www.w3schools.com/java/java_break.asp
 *
 */