package com.example.datefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/")
    public String getAfterDate() {
        LocalDate today = LocalDate.now();
        LocalDate afterDays = today.plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        String plusDate = afterDays.format(formatter);
        return plusDate;
    }

}
