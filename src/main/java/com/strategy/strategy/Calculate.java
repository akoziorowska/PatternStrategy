package com.strategy.strategy;

public class Calculate {
    private Multiply multiply;

    public Calculate(Multiply multiply) {
        this.multiply = multiply;
    }

    public Integer calculateCosts(Integer i){
        return multiply.multi(i);
    }
}
