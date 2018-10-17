package com.bastien.vehicule;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    private int door;
    private int litterPer100km;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car(String pModelName, String pDescription, String pManufacturer, int pYear, String pColor, int pSpeed, int[] pDimensions, int pWeight, int pDoor, int pLitterPer100km, String pMotor, List<String> pOptions) {
        super(modelName, description, manufacturer, year, color, speed, dimensions, weight);
        this.door = pDoor;
        this.litterPer100km = pLitterPer100km;
        this.motor = pMotor;
        this.options = pOptions;
    }

    public void startHeadLight() {
        System.out.println("J'allume mes phares");
    }

    public void openTrunk() {
        System.out.println("J'ouvre le coffre");
    }

    public int getDoor(){
        return door;
    }

    public int getLitterPer100km(){
        return litterPer100km;
    }

    public String getMotor(){
        return motor;
    }

    public List<String> getOptions(){
        return options;
    }


}
