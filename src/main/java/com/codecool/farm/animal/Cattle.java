package com.codecool.farm.animal;

public class Cattle extends Animal {

    public Cattle() {
        super();
    }
    @Override
    public void feed() {
        size += 2;
    }
}
