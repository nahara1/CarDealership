package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

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