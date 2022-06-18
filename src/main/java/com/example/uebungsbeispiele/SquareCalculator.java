package com.example.uebungsbeispiele;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class SquareCalculator {

    public int square(int a) {
        return a * a;
    }
}
