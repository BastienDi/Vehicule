package com.bastien.vehicule;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    Car car = new Car("Clio III", "Renault Clio III", "Renault", 2005, "Rouge", 225, new int[] {4032, 1720, 1497}, 1240, 5, 100, List.from(new String[]{"vitres électriques", "GPS", "Climatisation"}));

    }
}
