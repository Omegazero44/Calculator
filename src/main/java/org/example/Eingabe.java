package org.example;

import java.util.List;
import java.util.Scanner;

public class Eingabe {

    public static double zahl() {
        try {
            Scanner scannerVariable = new Scanner(System.in);
            return scannerVariable.nextDouble();
        } catch (Exception e) {
            System.out.println("Eingabe fehlgeschlagen bitte wiederholen");
            return zahl();
        }
    }

    public static String op() {
        while (true) {
            System.out.println("Bitte wählen Sie eine Rechenart aus:");
            System.out.println("1 Addition +");
            System.out.println("2 Subtraktion -");
            System.out.println("3 Multiplikation *");
            System.out.println("4 Division /");

            Scanner scannerVariable = new Scanner(System.in);
            String op = scannerVariable.nextLine();
            boolean opValid = List.of("+", "-", "*", "/").contains(op);
            if (!opValid) {
                System.out.println("eingabe ist ungültig bitte wiederholen");
            } else {
                return op;
            }
        }
    }
}