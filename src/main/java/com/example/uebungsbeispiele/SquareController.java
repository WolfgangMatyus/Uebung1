package com.example.uebungsbeispiele;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {
    private SquareCalculator calcSquare;

    @GetMapping("/square")
    public int square(@RequestParam int a) {
        return calcSquare.square(a);
    }
}