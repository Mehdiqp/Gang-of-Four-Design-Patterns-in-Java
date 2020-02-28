package com.company.structural.decorator;

public abstract class Beverage {

     String describe="Unknown beverage";

    public String getDescribe() {
        return describe;
    }

    public abstract double cost();
}
