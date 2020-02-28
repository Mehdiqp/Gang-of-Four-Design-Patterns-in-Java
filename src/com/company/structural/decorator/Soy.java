package com.company.structural.decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescribe() {
        return beverage.getDescribe() + ",soy";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
