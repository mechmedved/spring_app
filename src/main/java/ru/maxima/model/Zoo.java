package ru.maxima.model;

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " " + animal.getName() + " has age: " + animal.getAge());
        }
    }
}
