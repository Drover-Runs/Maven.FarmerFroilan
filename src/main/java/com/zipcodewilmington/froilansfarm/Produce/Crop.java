package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;

public interface Crop <CropType extends Edible> {
Boolean hasBeenHarvested = false;

Crop plant();

}
