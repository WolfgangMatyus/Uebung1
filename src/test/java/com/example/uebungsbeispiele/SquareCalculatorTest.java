package com.example.uebungsbeispiele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCalculatorTest {

    private SquareCalculator calcSquare;

    @BeforeEach
    void initialise() {
        calcSquare = new SquareCalculator();
    }

    @Test
    void square(){
        // arrange
        int a = 2;

        // act
        int result = calcSquare.square(a);

        // assert
        assertEquals(4, result);
    }


}
