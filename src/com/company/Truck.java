package com.company;

import java.util.Scanner;

import java.util.ArrayList;



public final class Truck extends Vehicle {
    private int itemQuantity;
    private Ton tonage;
    public static int quantity = 0;


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
        truck.setNumOfDoors();
        System.out.println ("Please enter truck color: ");
        truck.setColor (scnr.nextLine ());


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

        public Ton setTon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tonage ('one' / 'two'): ");
        tonage = Ton.valueOf(input.next().toLowerCase());
        // add if statement for cash payment to calculate change
        return tonage;
    }

    public static void printTrucks(ArrayList<Truck> truckArrayList) {
        for (Truck truck : truckArrayList) {
            System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-12s\n", truck.getName(), truck.getVin(), truck.getModel(), truck.getMaker(), truck.getColor(), truck.getYear());

        }
    }

    public static void sellTruck(ArrayList<Truck> trucksList, String _VIN) {
        for (Truck truck : trucksList) {

            if (truck.getVin().equals(_VIN)) {

                trucksList.remove(truck);
            }
        }
    }

    @Override
    protected void setDoors() {

    }
}





