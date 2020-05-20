package de.neuefische.animalkingdom;

import de.neuefische.animalkingdom.model.Animal;
import de.neuefische.animalkingdom.model.Reptile;
import de.neuefische.animalkingdom.model.Rodent;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args){

        Reptile reptile = new Reptile("repti", true);
        System.out.println(reptile.toString());

        Rodent rodent = new Rodent("rodi", 24);
        System.out.println(rodent.toString());

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Reptile("Echse", true));
        animals.add(new Rodent("Mice",24));


        for(Animal animal:animals){
            animal.toString();
            if(animal instanceof Reptile){
                System.out.println(((Reptile) animal).timeToReachBodytemperature(15,32));
            }
        }
    }

}
