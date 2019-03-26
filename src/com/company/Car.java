package com.company;

import java.util.*;

public final class Car extends Vehicle {
    private String maker, model, color;
    private int year;

    //quantity
    public static int Quantity=0;

    //




    Car() {


    }


    public void setQuantity(int newQty) {
        itemQuantity = newQty;
    }

    public void printCars() {
        System.out.println(itemName + " " + itemQuantity);
    }

    protected String itemName;

    protected int itemQuantity;



    // Getters and Setters for Car sub-class

    public Car(String _Vin) {
        setVin(_Vin);
        itemQuantity +=1;

    }



    public String getMaker() {
        return maker;
    }
    public void setMaker(String _Maker) {
        this.maker = _Maker;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String _Model) {
        this.model = _Model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String _Color) {
        this.color = _Color;
    }


    public int getYear() {
        return year;
    }
    public void setYear(int _carYear) {
        this.year = _carYear;
    }


    @Override
    public void addCarToInventory(Car car1) {

    }

    @Override
    public Iterator<Vehicle> iterator() {
        return null;
    }
}



