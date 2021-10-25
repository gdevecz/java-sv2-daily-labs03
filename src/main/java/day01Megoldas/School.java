package day01Megoldas;

import day01.Students;

import java.util.ArrayList;
import java.util.List;

public class School {

    public static void main(String[] args) {

        day01.Students students = new Students();
        students.addHeight(176);
        students.addHeight(180);
        System.out.println(students.isHeightsIncreasing());
        students.addHeight((160));
        System.out.println(students.isHeightsIncreasing());

        // egész primitív típusok
        // byte,  short, int,   long
        // 1byte, 2byte, 4byte, 8byte
        // valós primitív típusok
        // float, double
        // karakter primitív típus
        // char
        // logikai primitív típus
        // boolean
        // nincs int megfeleltetés

        // Csomagolóosztályok: a típusok műveleteit tartalmazzák

        // mikor használjuk:
        // ha nem akarunk műveletet végrahajtani rajtuk
        // nincsenek atrribútumai és metódusai
        int i = 500;
        // vannak atrribútumai és metódusai
        // csomagolóosztálynál primitív -> példány automatikus példányosítás (autoboxing)
        Integer j = 500;
        // leggyakoribb használata:
        // - listáknál
        // - szüveg számmá
        // int number Integer.parseInt("500");

        int k =  j; //unboxing
        int number = Integer.parseInt("500");
    }
}
