package com.bastien.vehicule;

public class Vehicle {

    private String description;
    private String manufacturer;
    private int speed;
    private int year;
    private String modelName;
    private String color;
    private int[] dimensions;
    private int weight;

    public Vehicle(String pDescription, String pManufacturer, int pSpeed, int pYear, String pModelName, String pColor, int[] dimensions, int pWeight) {

        this.description = pDescription;
        this.manufacturer = pManufacturer;
        this.speed = pSpeed;
        this.year = pYear;
        this.modelName = pModelName;
        this.color = pColor;
        this.dimensions = dimensions;
        this.weight = pWeight;
    }

    public void start() {
        System.out.println("Je suis " + modelName + " et je démarre");
    }

    public void stop() {
        System.out.println("Je suis " + modelName + " et je m'arrête");
    }

    public String getDescription(){
        return description;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public int getSpeed(){
        return speed;
    }

    public int getYear(){
        return speed;
    }

    public String getModelName(){
        return modelName;
    }

    public String getColor(){
        return color;
    }

    public int[] getDimensions(){
        return dimensions;
    }

    public int getWeight(){
        return weight;
    }


}
