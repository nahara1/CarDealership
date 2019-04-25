package com.company;

import java.util.ArrayList;

public class Dealership {
    private String name, address, phoneNumber;

    // dealership constructor

    public Dealership() {}

    // setters and getters

    public String getName() { return name; }

    public void setName(String _Name) { this.name = _Name; }

    public String getAddress() { return address; }

    public void setAddress(String _Address) { this.address = _Address; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String _PhoneNumber) { this.phoneNumber = _PhoneNumber; }

    // list information for all dealerships

    public void listDealerships(ArrayList<Dealership> dealerList) {
        System.out.println("Dealership Locations:");
        System.out.println();
        for (Dealership dealer : dealerList) {
            System.out.println("Name: " + dealer.getName());
            System.out.println("Address: " + dealer.getAddress());
            System.out.println("Phone Number: " + dealer.getPhoneNumber());
            System.out.println();
        }
    }
}





