/*
Project: Car Dealership
Purpose Details: Tests the truck class
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/29/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import org.junit.Test;

public class TruckTest extends MainTest {

    @Test
    public void addTruck() {
        try {
            Truck truck = new Truck();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    @Test
    public void printTrucks() {
    }

    @Test
    public void sellTruck() {
    }

    @Test
    public void getInput() {
    }
}