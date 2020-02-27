package com.company.structural.bridge;

public class Running implements Movement {
    @Override
    public void move() {
        System.out.println("Move: running");
    }
}
