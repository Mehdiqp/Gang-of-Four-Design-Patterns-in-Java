package com.company.structural.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        describe="House Blend coffee";

    }

    @Override
    public double cost() {
        return 2.1;
    }
}
