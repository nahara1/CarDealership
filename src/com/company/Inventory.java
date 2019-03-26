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
/*
    public Car getCar() {
        return (Car) vehiclesList.get(car);
    }
*/

// getters and setters

    // get and set quantity
    /*


     */

    public void addCarToInventory(Car _car) {
        carsList.add(_car);
    }

  /*
    public Parts getParts(Parts _parts) {
        return (Parts) partsList.get(_parts);
    }
    */

    public void setParts(Parts _parts) {
        partsList.add(_parts);
    }


    // print inventory

    // not working
    /*
    public void printList() {
        for (int i = 0; i < carsList.size(); i++) {

            System.out.println(carsList[i]);

        }

/*
        public void ArrayList printInvList{
        for (int i = 0; i < carsList.size(); i++) {
            System.out.println(carsList.get(i));
        }
    }

        public static double getRandomIntegerBetweenRange(double min, double max){
            double x = (int)(Math.random()*((max-min)+1))+min;
            return x;
        }

        /*
        public Inventory toString() {
            return "List";
        }
    }
    */
// needs fixing:
        /*
    Set<Inventory> set = new HashSet<Car>();
    public void addCars(Car c) {
        set.add(c);
    }
    public Iterator<Car> getCars() {
        return set.iterator();
    }
    public Iterator<Car> iterator() {
        return getCars();
    }


// does not work - So how to count Car objects inside vehiclesList??

  /*
    private int getVehiclesQuantity() {
        return vehiclesList.size();
    }

    public int getPartsQuantity() {
        return partsList.size();
    }



    /*
    public void setQuantity(int quantitytOf) {
        this.quantity = quantitytOf;
    }
*/


        // search for specific items in inventory

        // iterate through lists

        // the following shows an error
    /*

    for (Vehicle cars_ : vehiclesList) {
        System.out.println(cars_);
    }

  /*
    for (int i = 0; i < ; i++)
    {
        System.out.println(vehiclesList.get(i).toString());
    }
*/


        // get car/parts by their properties


    }
