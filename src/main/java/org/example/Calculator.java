package org.example;

public class Calculator {
    public double plus(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public double minus(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public double mal(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public double geteilt(double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }

    public  double berechnen(double zahl1,double zahl2,String op) {

        double ergebnis = 0;

        //Verarbeitung
        if (op.equals("+")) {
            ergebnis = plus(zahl1, zahl2);

        } else if (op.equals("-")) {
            ergebnis = minus(zahl1, zahl2);

        } else if (op.equals("*")) {
            ergebnis = mal(zahl1, zahl2);

        } else if (op.equals("/")) {
            ergebnis = geteilt(zahl1, zahl2);
        }

    return ergebnis ; }
}


