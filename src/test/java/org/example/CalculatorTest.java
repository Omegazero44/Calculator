package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void plus() {
        double ergebnis = new Calculator().plus(20, 40);

        Assertions.assertEquals(60, ergebnis);
    }

    @Test
    void minus() {
        double ergebnis = new Calculator().minus(60, 20);

        Assertions.assertEquals(40, ergebnis);
    }

    @Test
    void mal() {
        double ergebnis = new Calculator().mal(60, 20);

        Assertions.assertEquals(1200, ergebnis);
    }

    @Test
    void geteilt() {
        double ergebnis = new Calculator().geteilt(60, 20);

        Assertions.assertEquals(3, ergebnis);
    }
}