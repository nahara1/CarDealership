package com.company;

import java.util.InputMismatchException;
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

    /**
     * addTruck method adds a new truck to the inventory
     * <p>
     *   The addTruck method prompts user to enter
     *   a truck VIN, model, maker, year, color, and price,
     *   to be stored in the inventory.
     * </p>
     * @return a truck object
     */
    public Truck addTruck() {
        Truck truck = new Truck ();
        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter Dealership ID: ");
        truck.setDealershipID(scnr.nextInt());
        System.out.println ("Please enter VIN number: ");
        truck.setVin (scnr.nextLine ());
        System.out.println ("Please enter truck model: ");
        truck.setModel (scnr.nextLine ());
        System.out.println ("Please enter truck maker: ");
        truck.setMaker (scnr.nextLine ());
        System.out.println ("Please enter truck year: ");
        String _year = testInt(getInput());
        year = Integer.parseInt(_year);
        truck.setYear(year);
        truck.setTon();
        truck.setNumOfDoors();
        System.out.println ("Please enter truck color: ");
        truck.setColor (scnr.nextLine ());
        System.out.println("Please enter truck price: ");
        price = Double.parseDouble(getInput());
        String _price = testDouble(getInput());
        price = Double.parseDouble(_price);
        truck.setPrice(price);

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

    public static String getInput() {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        return input;

    }

    /**
     * testDouble method tests if input is a double
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input for setting an auto part price
     *  is a double.
     * </p>
     *
     * @param price user input
     * @return a price
     * @throws InputMismatchException if input tested is not a double
     *
     */
    public static String testDouble(String price) {
        try {

            if (price.matches("\\d+\\.\\d*$")) {
                return price;
            }
            else  {
                throw new InputMismatchException("not price");
            }

        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Please try again.");
            return getInput();

        }

    }

    public static String testInt(String input) {
        try {
            if (input.matches("\\d*$")) {
                return input;
            }
            else  {
                throw new NumberFormatException("not an integer");
            }
        } catch (NumberFormatException notAnInt) {
            System.out.println("Invalid input. You did not enter an integer number. Please try again. \n");
            return getInput();
        }
    }
}





