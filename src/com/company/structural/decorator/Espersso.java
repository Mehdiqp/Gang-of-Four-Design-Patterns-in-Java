package com.company.structural.decorator;

public class Espersso extends Beverage {

    public Espersso() {
        describe="Espersso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
