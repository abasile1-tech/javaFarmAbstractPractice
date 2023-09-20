package org.example;

public class Horse extends FarmAnimal{
    private String breed;

    public Horse(String breed) {
        super("horse");
        this.breed = breed;
    }

    @Override
    public String makeNoise() {
        return "neigh";
    }

    public String getBreed() {
        return breed;
    }

    public String introduceSelf() {
        return "Hi, I am a " + this.getSpecies() + " from " + this.breed + " family, " + this.makeNoise() + " " + this.makeNoise();
    }
}
