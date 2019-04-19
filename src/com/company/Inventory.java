package com.company;

import java.util.*;


public class Inventory {

    //Data Members
    protected ArrayList carsList;
    protected ArrayList partsList;
    protected ArrayList trucksList;


    //Constructor Method

    public Inventory() {
        carsList = new ArrayList<Car>();
        trucksList = new ArrayList<Truck>();
        partsList = new ArrayList<Parts>();
    }



// output car by price in asc or desc order

// getters and setters


    public void addCarToInventory(Car _car) {
        carsList.add(_car);
    }



    public void setParts(Parts _parts) {
        partsList.add(_parts);
    }

// add printInventory method
    // use index to remove


    }
