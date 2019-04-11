package com.company;

import java.util.*;

public final class Car extends Vehicle {

    String color;
    //quantity
    public static int Quantity=0;

    //


    public Car() {

    }

    public Car(String vin_) {
        super.setVin(vin_);
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
        car.setDoors();

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


    public String getColor() {
        return color;
    }

    public void setColor(String _Color) {
        this.color = _Color;
    }


    protected String itemName;

    protected int itemQuantity;


    public static void printCars(ArrayList<Car> carList) {
        for (Car car : carList) {
            //System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.print(car);
            System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-12s\n", car.getName(), car.getVin(), car.getModel(), car.getMaker(), car.getColor(), car.getYear() );

        }
    }

    // methods to print specific car types by color, year, maker


    public static void printCarByColor(ArrayList<Car> carList, String _color) {
        for (Car car : carList) {

            // cannot use super.color from a non static context, so added String color to Car class

            if (car.color.equals(_color)) {
               // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                System.out.println("Car VIN number:" + car.getVin() + " Car color:" + car.getColor());
            }
        }
    }











}



