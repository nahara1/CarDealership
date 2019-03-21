package com.company;

import java.util.Iterator;

public final class Truck extends Vehicle {

   // private enum Ton {}


    private Ton tonage;

// Constructor

    public Truck(String _Vin) {
        setVin(_Vin);

    }


    public void setTon(Ton _tonage) {
        tonage = _tonage;
    }

    public Ton getTon() {
        return  tonage;
    }

    public void move(){
        setWheeldrive(Wheeldrive.four);
    }


    @Override
    public void addCarToInventory(Car car1) {

    }

    @Override
    public Iterator<Vehicle> iterator() {
        return null;
    }
}





