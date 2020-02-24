package com.euclidean.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GCDGenerator{

    public static void main(String[] args)
    {
        GCD gcd= new GCD(17,17);
        gcd.countGCD();
    }
}
