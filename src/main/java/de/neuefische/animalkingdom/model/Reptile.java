package de.neuefische.animalkingdom.model;

public class Reptile extends Animal{
    int heartchambers = 4;
    boolean carnivore;
    double temperature=15; // As starting value

    public Reptile(String name, boolean carnivore) {
        super(name);
        this.carnivore = carnivore;
    }

    public int getHeartchambers() {
        return heartchambers;
    }

    public boolean isCarnivore() {
        return carnivore;
    }

    public void setCarnivore(boolean carnivore) {
        this.carnivore = carnivore;
    }

    public String timeToReachBodytemperature(double actualTemperature, double desiredTemperature){
        if(desiredTemperature<=actualTemperature){
            return "get out of the Sun now!";
        }
        return "Time to desired Temperature: " + (desiredTemperature-actualTemperature)*0.3 + " Minutes";
    }
}
