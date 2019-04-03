package com.company;

import java.util.*;

public final class Car extends Vehicle {
    private String maker, model, color;
    private int year, cCount;

    //quantity
    public static int Quantity=0;

    //


    Car() {


    }

    public Car addCar() {
        Car car = new Car();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter VIN number: ");
        car.setVin(scnr.nextLine());
        System.out.println("Please enter car model: ");
        car.setModel(scnr.nextLine());
        System.out.println("Please enter car maker: ");
        car.setMaker(scnr.nextLine());
        System.out.println("Please enter car year: ");
        car.setYear(scnr.nextInt());

        // not working ??
        System.out.println("Please enter car color: ");
        car.setColor(scnr.nextLine());



        return car;
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

/*
    @Override
    public void addCarToInventory(Car car1) {

    }
    */

}



