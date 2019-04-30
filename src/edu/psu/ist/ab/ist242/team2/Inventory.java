/*
Project: Car Dealership
Purpose Details: Contains the inventory. Consists of four array list of car, trucks, parts and transactions.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/28/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.*;


public class Inventory {

    /**
     * Protected Data Members
     * Car, trucks, and parts ArrayLists
     */
    protected ArrayList carsList;
    protected ArrayList partsList;
    protected ArrayList trucksList;
    protected ArrayList transList;


    /**
     * Constructor Method creates ArrayLists named carsList, trucksList, partsList, and transList
     * of Car, Truck, Parts, and Transaction types
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



    }
