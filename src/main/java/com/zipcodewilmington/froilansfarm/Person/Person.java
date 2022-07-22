package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;

<<<<<<< HEAD
public interface Person <Eater> extends NoiseMaker{
    String makeNoise();

    public Eater eat();

=======
public interface Person extends NoiseMaker, Eater {
>>>>>>> master


}
