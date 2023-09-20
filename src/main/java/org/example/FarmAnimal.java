package org.example;

public abstract class FarmAnimal {
    private String species;

    public FarmAnimal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public String introduceSelf() {
        return "Hi, I am a " + this.getSpecies();
    }

    public abstract String makeNoise();
}
