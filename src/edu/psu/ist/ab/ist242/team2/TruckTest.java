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