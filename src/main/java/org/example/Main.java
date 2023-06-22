package org.example;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] agrs) {
        double zahl1, zahl2, ergebnis = 0;
        String op ;
        Scanner scannerVariable = new Scanner(System.in);
        Calculator calculator = new Calculator();

        //Erste zahl einlessen
        out.println("Erste Zahl bitte.");
        zahl1 = Eingabe.zahl();

        //Operant einlesen
        while (true){

            System.out.println("Bitte wählen Sie eine Rechenart aus:");
            out.println("1 Addition +");
            out.println("2 Subtraktion -");
            out.println("3 Multiplikation *");
            out.println("4 Division /");

            op = scannerVariable.nextLine();
            boolean opValid="+-*/".contains(op);
            if (!opValid){
                System.out.println("eingabe ist ungültig bitte wiederholen");
            }else {
                break;
            }
        }

        //Zweite zahl einlesen
        out.println("Zweite Zahl bitte.");
        zahl2 = Eingabe.zahl();

        //Verarbeitung
        if (op.equals("+")) {
            ergebnis = calculator.plus(zahl1, zahl2);

        } else if (op.equals("-")) {
            ergebnis = calculator.minus(zahl1, zahl2);

        } else if (op.equals("*")) {
            ergebnis = calculator.mal(zahl1, zahl2);

        } else if (op.equals("/")) {
            ergebnis = calculator.geteilt(zahl1, zahl2);
        }
        //Ausgabe
        out.println("Das Ergebnis ist: " + ergebnis);


    }


}

