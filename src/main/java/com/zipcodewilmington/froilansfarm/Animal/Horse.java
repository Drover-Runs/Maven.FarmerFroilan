package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

public class Horse extends Animal implements Rider{

    public Horse(Integer id, Integer age, Boolean hasBeenFed){
        super(id, age, hasBeenFed);
    }

    public void eat() {

    }

    public void makeNoise() {
        return "Neigh!";
    }

    public void mount() {

    }

    public void dismount() {

    }
}
