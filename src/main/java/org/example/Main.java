package org.example;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //Erste zahl einlessen
        System.out.println("Erste Zahl bitte.");
        double zahl1 = Eingabe.zahl();

        String op =Eingabe.op();

        //Zweite zahl einlesen
        System.out.println("Zweite Zahl bitte.");
        double zahl2 = Eingabe.zahl();

        double ergebnis =calculator.berechnen(zahl1,zahl2,op);

        //Ausgabe
        System.out.println("Das Ergebnis ist: " + ergebnis);


    }


}

