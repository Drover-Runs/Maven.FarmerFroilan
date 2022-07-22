package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {


    @Test
    public void isAnAnimalTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }
    @Test
    public void mounted() {
        //Given
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //When
        Assert.assertEquals(true, farmer.mount(horse));
    }

    @Test
    public void dismounted() {
        //Given
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //When
        Assert.assertEquals(horse.dismounted(), farmer.dismount());
    }

    @Test
    public void makeNoiseTest(){
        Horse horse = new Horse();
        String noise = "Neigh!";
        Assert.assertEquals(noise, horse.makeNoise());

    }
}