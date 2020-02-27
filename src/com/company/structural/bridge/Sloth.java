package com.company.structural.bridge;

public class Sloth extends Animal {
    public Sloth(Movement movement) {
        super(movement);
    }

    @Override
    protected void move() {
    movement.move();
    }
}
