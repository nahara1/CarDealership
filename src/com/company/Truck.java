package com.company;

import java.util.Iterator;
import java.util.Scanner;

public final class Truck extends Vehicle {
    private int itemQuantity, year;
    private String maker, model, color;
    private Ton tonage;
    public static int Quantity = 0;

// Constructor

    public Truck(String _Vin) {
        setVin (_Vin);
        itemQuantity += 1;
    }

    public Truck() {

    }

    public Truck addTruck() {
        Truck truck = new Truck ();
        Scanner scnr = new Scanner (System.in);
        System.out.println ("Please enter VIN number: ");
        truck.setVin (scnr.nextLine ());
        System.out.println ("Please enter truck model: ");
        truck.setModel (scnr.nextLine ());
        System.out.println ("Please enter truck maker: ");
        truck.setMaker (scnr.nextLine ());
        System.out.println ("Please enter truck year: ");
        truck.setYear (scnr.nextInt ());
        truck.setTon();

        /* not working ??
        System.out.println ("Please enter truck color: ");
        truck.setColor (scnr.nextLine ());
        */

        return truck;
    }


        public void setTon (Ton _tonage){
            tonage = _tonage;
        }

        public Ton getTon () {
            return tonage;
        }

        public void move () {
            setWheeldrive (Wheeldrive.four);
        }

    public String getModel() {
        return model;
    }

    public void setModel(String _Model) {
        this.model = _Model;
    }

    public String getMaker() {
        return maker;
    }
    public void setMaker(String _Maker) {
        this.maker = _Maker;
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

    public Ton setTon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tonage: ");
        tonage = Ton.valueOf(input.next().toLowerCase());
        // add if statement for cash payment to calculate change
        return tonage;
    }
}





