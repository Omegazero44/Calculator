package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] agrs) {
        double zahl1, zahl2, ergebnis = 0;
        Scanner scannerVariable = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.println("Bitte wählen Sie eine Rechenart aus:");
        out.println("1 Addition +");
        out.println("2 Subtraktion -");
        out.println("3 Multiplikation *");
        out.println("4 Division /");

        String op = scannerVariable.nextLine();

        out.println("Erste Zahl bitte.");
        zahl1 = Eingabe.zahl();
        out.println("Zweite Zahl bitte.");
        zahl2 = Eingabe.zahl();

        if (op.equals("+")) {
            ergebnis = calculator.plus(zahl1,zahl2);
        }
        else if (op.equals("-" )) {
            ergebnis = calculator.minus(zahl1,zahl2);
        }
        else if (op.equals("*" )) {
            ergebnis = calculator.mal(zahl1,zahl2);
        }
        else if (op.equals("/" )) {
            ergebnis = calculator.geteilt(zahl1,zahl2);
        }
        out.println("Das Ergebnis ist: " + ergebnis);

    }


}

