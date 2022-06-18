package com.example.uebungsbeispiele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareCalculatorTest {

    private SquareCalculator calcSquare;

    @BeforeEach
            void initialise() {calcSquare = new SquareCalculator();}

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
