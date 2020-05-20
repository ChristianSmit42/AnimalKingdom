package de.neuefische.animalkingdom.model;

public class Rodent extends Animal{
    private int teath;

    public Rodent(String name, int teath) {
        super(name);
        this.teath = teath;
    }

    public int getTeath() {
        return teath;
    }

    public void setTeath(int teath) {
        this.teath = teath;
    }

    @Override
    public String toString() {
        return "Rodent{" +
                super.getName() +
                "teath=" + teath +
                '}';
    }

    public String movement() {
        return "running";
    }


}
