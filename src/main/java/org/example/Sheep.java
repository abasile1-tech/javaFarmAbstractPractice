package org.example;

//in constructor, make species ‘sheep’
//        an implementation of the makeANoise which returns an appropriate String (eg. baa)
//        override of introduceYourself returning 'Hi, I am a sheep, baa baa'. Note that species and noise should come from variable.
public class Sheep extends FarmAnimal{
    public Sheep(String species) {
        super(species);
    }

    @Override
    public String makeNoise() {
        return "baa";
    }

    @Override
    public String introduceSelf() {
        return "Hi, I am a " + this.getSpecies() + ", " + this.makeNoise() + " " + this.makeNoise();
    }
}
