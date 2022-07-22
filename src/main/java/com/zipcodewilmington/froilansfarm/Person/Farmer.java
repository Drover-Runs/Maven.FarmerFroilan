package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

<<<<<<< HEAD
public class Farmer <Person> implements Rider {
    public void mount() {
        
    }

    public void dismount() {

    }
=======
public class Farmer <Person> implements Rider  {

    public void mount() {
        
    }
    public void dismount() {

    }

>>>>>>> master
    //Got a warning from the IDE about using raw types and awareness of type erasure when I did
    // public class Farmer <Farmer extends Person> {}.


}
