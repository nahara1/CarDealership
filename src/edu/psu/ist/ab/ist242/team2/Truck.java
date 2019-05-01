/*
Project: Car Dealership
Purpose Details: The Truck class is a child of the Vehicle class. It contains setters, getters, and methods that add, modify, remove, and search for trucks in the dealership inventory.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/28/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.Scanner;
import java.util.*;

import java.util.ArrayList;

/**
 * <h1>Trucks</h1>
 *<p>
 * The Truck class is a child of the Vehicle class.
 * It contains setters, getters, and methods that add, modify,
 * remove, and search for trucks in the dealership inventory.
 *</p>
 * @author Ronald, Narrara
 *
 */


public final class Truck extends Vehicle {

    /**
     * Truck tonage
     */
    private Ton tonage;



// Constructor

    /**
     * Truck constructor
     * @param _Vin VIN
     */
    public Truck(String _Vin) {
        setVin (_Vin);
    }

    /**
     * Truck constructor
     */
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
        String dealer_id = Exception.testInt(Exception.getInput());
        dealership_id = Integer.parseInt(dealer_id);
        truck.setDealershipID(dealership_id);

        System.out.println ("Please enter VIN number: ");
        vin = Exception.testAlphaNumeric(Exception.getInput());
        truck.setVin(vin);

        System.out.println ("Please enter truck model: ");
        model = Exception.testAlpha(Exception.getInput());
        truck.setModel(model);

        System.out.println ("Please enter truck maker: ");
        maker = Exception.testAlpha(Exception.getInput());
        truck.setMaker(maker);

        System.out.println ("Please enter truck year: ");
        String _year = Exception.testInt(Exception.getInput());
        year = Integer.parseInt(_year);
        truck.setYear(year);

        truck.setTon();

        truck.setNumOfDoors();

        System.out.println ("Please enter truck color: ");
        color = Exception.testAlpha(Exception.getInput());
        truck.setColor(color);

        System.out.println("Please enter truck price: ");
        price = Double.parseDouble(Exception.getInput());
        String _price = Exception.testDouble(Exception.getInput());
        price = Double.parseDouble(_price);
        truck.setPrice(price);

        return truck;
    }

    /**
     * Truck tonage setter
     * @param _tonage
     */

    public void setTon (Ton _tonage){
        tonage = _tonage;
    }

    /**
     * Truck tonage getter
     * @return tonage
     */
    public Ton getTon () {
            return tonage;
        }

    /**
     * move method sets wheeldrive
     */
    public void move () {
        setWheeldrive (Wheeldrive.four);
    }

    /**
     * setTon prompts user for an input
     *
     * <p>
     * setTon method asks for user input to set truck tonage
     * and converts the input to lowercase to assure it matches
     * the Ton enum values.
     * <p>
     *
     * @return tonage object
     */
        public Ton setTon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tonage ('one' / 'two'): ");
        tonage = Ton.valueOf(input.next().toLowerCase());
        return tonage;
    }

    /**
     * <p>
     * printTrucks method have a for each method to
     * print out all trucks' name, vin number, module, maker, color
     * that are in the inventory on certain format
     * <p>
     *
     *
     * @param truckArrayList Array list of trucks
     *
     */
    public static void printTrucks(ArrayList<Truck> truckArrayList) {
        for (Truck truck : truckArrayList) {
            System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-12s\n", truck.getName(), truck.getVin(), truck.getModel(), truck.getMaker(), truck.getColor(), truck.getYear());

        }
    }

    /**
     *
     * sellTruck method removes a truck item from the truck array list
     * @param trucksList truck Array List
     * @param _VIN Vehicle Identification Number
     * @throws ConcurrentModificationException if VIN does not correspond
     *                                         to any truck in the inventory
     * @author Narrara & JiaJia
     */
    public static void sellTruck(ArrayList<Truck> trucksList, String _VIN) {
        try {
            for (Truck truck : trucksList) {

                if (truck.getVin().equals(_VIN)) {

                    trucksList.remove(truck);
                }
            }
        }
        catch (ConcurrentModificationException e){
            System.out.println("Invalid input. Make sure you entered the correct VIN.");
            sellTruck(trucksList, _VIN);
        }

    }

    /**
     * printTrucksByLocation method prints trucks that are of a specific dealership
     * @param truckList car Array List
     * @param _location vehicle location
     * @author Alex, JiaJia & Narrara
     */
    public static void printTrucksByLocation(ArrayList<Truck> truckList, String _location) {
        for (Truck truck : truckList) {
            if (truck.location.equals(_location)) {
                System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-10s \n", truck.getVin(), truck.getYear(), truck.getMaker(), truck.getModel(), truck.getVLocation(), truck.getPrice());
            }
        }
    }
}