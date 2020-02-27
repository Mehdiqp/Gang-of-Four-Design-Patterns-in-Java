package com.company.structural.bridge;

public abstract class Animal {
    protected Movement movement;

    public Animal(Movement movement) {
        this.movement = movement;
    }
    protected abstract void move();
}
