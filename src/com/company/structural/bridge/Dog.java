package com.company.structural.bridge;

public class Dog extends Animal {
    public Dog(Movement movement) {
        super(movement);
    }

    @Override
    protected void move() {
        movement.move();
    }
}
