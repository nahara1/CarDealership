package com.company;

import java.util.*;


public class Inventory {

    /**
     * Protected Data Members
     * Inventory have ArrayList of carsList, partsList, trucksList, transList
     */
    protected ArrayList carsList;
    protected ArrayList partsList;
    protected ArrayList trucksList;
    protected ArrayList transList;


    /**
     * Constructor Method
     * Create ArrayList named carsList, trucksList, partsList, and transList
     * of types of Car, Truck, Parts, and Transaction
     */
    public Inventory() {
        carsList = new ArrayList<Car>();
        trucksList = new ArrayList<Truck>();
        partsList = new ArrayList<Parts>();
        transList = new ArrayList<Transaction>();
    }



// output car by price in asc or desc order

// getters and setters

    /**
     * addCarToInventory method adds a car to carsList
     * @param _car
     */
    public void addCarToInventory(Car _car) {
        carsList.add(_car);
    }

    /**
     * setParts method adds parts to partsList
     * @param _parts
     */

    public void setParts(Parts _parts) {
        partsList.add(_parts);
    }

// add printInventory method
    // use index to remove


    }
