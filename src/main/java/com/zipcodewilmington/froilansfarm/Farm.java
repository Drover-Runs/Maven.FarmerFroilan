package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by leon on 2/26/18.
 */
public class Farm {




    public void setupField(){
//        ArrayList<Object> cropArray = new ArrayList<>(5);
        Field field = new Field();
        Corn corn = new Corn();
        Tomato tomato = new Tomato();
        Carrot carrot = new Carrot();
        Onion onion = new Onion();
        Radish radish = new Radish();
        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();
        CropRow carrotRow = new CropRow();
        CropRow onionRow = new CropRow();
        CropRow radishRow = new CropRow();
        cornRow.plantCrop(corn, 10);
        tomatoRow.plantCrop(tomato, 10);
        carrotRow.plantCrop(carrot, 10);
        onionRow.plantCrop(onion, 10);
        radishRow.plantCrop(radish, 10);
        field.add(cornRow);
        field.add(tomatoRow);
        field.add(carrotRow);
        field.add(onionRow);
        field.add(radishRow);
//        cropArray.add(corn);
//        cropArray.add(tomato);
//        cropArray.add(carrot);
//        cropArray.add(onion);
//        cropArray.add(radish);
//        int j = 0;
//        for (Object crop:cropArray) {
//            for (int i = j; i <= 10; i++) {
//                field.getCropRow(i).plantCrop((Crop) crop);;
//            }
//            j++;
//        }



//        Shelter shelter = new Shelter();
//        ChickenCoop ck = new ChickenCoop();
//        Chicken chicken = new Chicken();
//        ck.add(chicken);
//        shelter.add(ck);
//        System.out.println(shelter.getTotalOccupants());
    }

    public void setupAnimals(){

        Shelter shelter = new Shelter();

    }

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.setupField();
    }


}
