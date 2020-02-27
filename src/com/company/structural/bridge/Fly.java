package com.company.structural.bridge;

public class Fly implements Movement {
    @Override
    public void move() {
        System.out.println("Move: fly");
    }
}
