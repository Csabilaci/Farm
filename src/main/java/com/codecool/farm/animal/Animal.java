package com.codecool.farm.animal;

public abstract class Animal {

    protected int size = 0;

    public Animal() {
    }
    public int getSize() {
        return size;
    }
    public abstract void feed();
}
