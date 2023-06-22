package org.example;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] agrs) {
        double zahl1, zahl2, ergebnis = 0;
        Scanner scannerVariable = new Scanner(System.in);
        Calculator calculator = new Calculator();

        out.println("Erste Zahl bitte.");
        zahl1 = Eingabe.zahl();

        out.println("Zweite Zahl bitte.");
        zahl2 = Eingabe.zahl();


        System.out.println("Bitte wählen Sie eine Rechenart aus:");
        out.println("1 Addition +");
        out.println("2 Subtraktion -");
        out.println("3 Multiplikation *");
        out.println("4 Division /");

        String op = scannerVariable.nextLine();

        if (op.equals("+")) {
            ergebnis = calculator.plus(zahl1, zahl2);

        } else if (op.equals("-")) {
            ergebnis = calculator.minus(zahl1, zahl2);

        } else if (op.equals("*")) {
            ergebnis = calculator.mal(zahl1, zahl2);

        } else if (op.equals("/")) {
            ergebnis = calculator.geteilt(zahl1, zahl2);

        } else {
            System.out.println("eingabe ist ungültig");
        }

        out.println("Das Ergebnis ist: " + ergebnis);


    }


}

