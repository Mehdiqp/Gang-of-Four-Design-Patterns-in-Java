package com.company.structural.bridge;

public class Eagle extends Animal {

    public Eagle(Movement movement) {
        super(movement);
    }

    @Override
    protected void move() {
    movement.move();
    }
}
