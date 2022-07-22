package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;


public interface Person <Eater> extends NoiseMaker{
     void makeNoise();

    public Eater eat();

}
