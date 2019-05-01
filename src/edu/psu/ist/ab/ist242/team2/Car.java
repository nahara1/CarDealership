/*
Project: Car Dealership
Purpose Details: Creates object car extended from vehicle. Also contains methods to sell a vehicle and print the list of vehicles by model or color.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15
Last Date Changed: 4/28/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.*;

/**
 * <h1>Cars</h1>
 *<p>
 * The Car class is a child class of the Vehicle class.
 * It contains methods that add, remove, and search for cars
 * in the dealership inventory.
 *</p>
 *
 */

public final class Car extends Vehicle {


    /**
     * Number of doors
     */
    NumDoors numOfDoors;

    /**
     * Car Constructor
     */

    public Car() { }

    /**
     * Car Constructor requiring VIN
     * @param vin_
     */
    public Car(String vin_) {
        super.setVin(vin_);
    }


    /**
     * addCar method adds a new car to the inventory
     * <p>
     *   The addCar method prompts user to enter
     *   a car VIN, model, maker, year, color, and price,
     *   to be stored in the inventory.
     * </p>
     * @return a Car object
     */

    public Car addCar() {
        Car car = new Car();
        Scanner scnr = new Scanner(System.in);


        System.out.println("Enter Dealership ID: ");
        car.setDealershipID(scnr.nextInt());

        System.out.println("Please enter location: ");
        location = Exception.testAlpha(Exception.getInput());
        car.setVLocation(location);

        System.out.println("Please enter VIN number: ");
        vin = Exception.testAlphaNumeric(Exception.getInput());
        car.setVin(vin);

        System.out.println("Please enter car model: ");
        model = Exception.testAlpha(Exception.getInput());
        car.setModel(model);

        System.out.println("Please enter car maker: ");
        maker = Exception.testAlpha(Exception.getInput());
        car.setMaker(maker);

        System.out.println("Please enter car year: ");
        String _year = Exception.testInt(Exception.getInput());
        year = Integer.parseInt(_year);
        car.setYear(year);

        car.setNumOfDoors();

        //scnr.nextLine(); //IMPORTANT: do not remove, needed so that setColor works properly

        System.out.println("Please enter car color: ");
        color = Exception.testAlpha(Exception.getInput());
        car.setColor(color);

        System.out.println("Please enter car price: ");
        String _price = Exception.testDouble(Exception.getInput());
        price = Double.parseDouble(_price);
        car.setPrice(price);

        return car;
    }


    /**
     * printCars method prints car inventory list
     * @param carList car list Array List
     */
    public static void printCars(ArrayList<Car> carList) {
        for (Car car : carList) {
            System.out.printf("%-10s | %-12s | %-10s | %-10s | %-12s | %-10s \n", car.getVin(), car.getModel(), car.getMaker(), car.getColor(), car.getYear(), car.getPrice());

        }
    }

    // methods to print specific car types by color, year, maker


    /**
     * printCarsByColor method prints cars that are of a certain color
     * @param carList car Array List
     * @param _color a specific car color
     */
    public static void printCarByColor(ArrayList<Car> carList, String _color) {
        for (Car car : carList) {

            // cannot use super.color from a non static context, so added String color to Car class

            if (car.color.equals(_color)) {
               // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                System.out.println(" Car VIN number: " + car.getVin() + " Car color: " + car.getColor() + " Car Maker: " + car.getMaker() + " Car Model: " + car.getModel());
            }
        }
    }

    /**
     * printCarsByNumDoors method prints cars by number of doors
     * @param carList car Array List
     * @param _doors number of doors
     */

    public static void printCarByNumDoors(ArrayList<Car> carList, NumDoors _doors) {
        for (Car car : carList) {

            if (car.numOfDoors.equals(_doors)) {
                // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                System.out.println("Car VIN number:" + car.getVin() + " Car color:" + car.getColor());
            }
        }
    }

    /**
     * printCarsByMaker method prints cars by their maker
     * @param carList car Array List
     * @param _maker car maker
     * @author JiaJia & Narrara
     */

    public static void printCarByMaker(ArrayList<Car> carList, String _maker) {
        for (Car car : carList) {

            if (car.maker.equals(_maker)) {
                // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                System.out.println("Car VIN number:" + car.getVin() + " Car color:" + car.getColor());
            }
        }
    }

    /**
     *
     * printCarsByModel method prints cars by model
     * @param carList car Array List
     * @param _model car model type
     *
     */

    public static void printCarByModel(ArrayList<Car> carList, String _model) {
            for (Car car : carList) {

                if (car.maker.equals(_model)) {
                    // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                    System.out.println("Car VIN number:" + car.getVin() + " Car color:" + car.getColor());
                }
            }
    }

    /**
     *
     * sellCar method removes a car item from the car array list
     * @param carList car Array List
     * @param _VIN Vehicle Identification Number
     * @throws ConcurrentModificationException if VIN does not correspond
     *                                         to any car in the inventory
     *
     */

    public static void sellCar(ArrayList<Car> carList, String _VIN) {

        try {
            for (Car car : carList) {

                if (car.getVin().equals(_VIN)) {

                    carList.remove(car);
                }
            }
        }
        catch (ConcurrentModificationException e) {
            System.out.println("Invalid input. Make sure you entered the correct VIN.");
            sellCar(carList, _VIN);
            }
        }


    /**
     * printCarsByLocation method prints cars that are of a specific dealership
     * @param carList car Array List
     * @param _location vehicle location
     */
    public static void printCarByLocation(ArrayList<Car> carList, String _location) {
        for (Car car : carList) {

            // cannot use super.color from a non static context, so added String color to Car class

            if (car.location.equals(_location)) {
                System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-10s \n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getVLocation(), car.getPrice());
            }
        }
    }


}







