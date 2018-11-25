package com.strategy.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);

        Multiply mOnce = new MultiplyOnce();
        Multiply mDouble = new MultiplyDouble();
        Multiply mTriple = new MultiplyTripple();
        System.out.println("MultiplyOnce="+new Calculate(mOnce).calculateCosts(2));
        System.out.println("MultiplyDouble="+new Calculate(mDouble).calculateCosts(2));
        System.out.println("MultiplyTripple="+new Calculate(mTriple).calculateCosts(2));
    }

}
