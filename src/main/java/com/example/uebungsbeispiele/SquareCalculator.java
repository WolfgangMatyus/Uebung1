package com.example.uebungsbeispiele;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareCalculator {

    @GetMapping("/square")
    public int square(int a) {
        return a * a;
    }
}
