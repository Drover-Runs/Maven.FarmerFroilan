package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<VehicleT extends Rider> implements NoiseMaker {
    public String makeNoise() {
        return "brrrrrr";
    }

    void operate() {

    }

}
