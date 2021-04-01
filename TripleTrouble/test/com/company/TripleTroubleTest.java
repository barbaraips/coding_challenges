package com.company;

import org.junit.jupiter.api.Test;

import static com.company.TripleTrouble.tripleDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TripleTroubleTest {

    @Test
    void testTripleDouble() {
        String a = "123456";
        String b = "654789";

        assertEquals(1, tripleDouble(a, b));
    }

    @Test
    void testTripleDoubleFail() {
        String a = "283";
        String b = "151";

        assertEquals(0, tripleDouble(a, b));
    }

}