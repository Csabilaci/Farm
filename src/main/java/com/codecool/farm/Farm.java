package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    private final List<Animal> animalList;

    public Farm(List<Animal> animalList) {
        this.animalList = animalList;
    }
    public void feedAnimals() {
        for(Animal animal : this.animalList) {
            animal.feed();
        }
    }
    public void butcher(Butcher butcher) {
        this.animalList.removeIf(butcher::canButcher);
    }
    public boolean isEmpty() {
        return this.animalList.isEmpty();
    }
    public List<String> getStatus() {

        return new ArrayList<>();
    }
    public List<Animal> getAnimals() {

        return this.animalList;
    }
}
