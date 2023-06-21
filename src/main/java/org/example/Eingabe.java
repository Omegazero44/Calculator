package org.example;

import java.util.Scanner;

public class Eingabe {

    public static double zahl() {
        Scanner scannerVariable = new Scanner(System.in);
        try {
            return scannerVariable.nextDouble();
        }
        catch(Exception e ) {
            System.out.println("Eingabe fehlgeschlagen bitte wiederholen");
            scannerVariable.nextLine();
            return zahl();
        }
    }
}
