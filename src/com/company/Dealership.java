package com.company;

import java.util.ArrayList;

public class Dealership {
    private String name, address, phoneNumber;
    private int dealershipID;

    // dealership constructor

    public Dealership(name, address, phoneNumber) {

    }

    // setters and getters

    public int getDealershipID() { return dealershipID; }

    public void setDealershipID(int _DealershipID) { this.dealershipID = _DealershipID; }

    public String getName() { return name; }

    public void setName(String _Name) { this.name = _Name; }

    public String getAddress() { return address; }

    public void setAddress(String _Address) { this.address = _Address; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String _PhoneNumber) { this.phoneNumber = _PhoneNumber; }

    // list information for all dealerships

    public void listDealerships(ArrayList<Dealership> dealerList) {
        System.out.println("Dealership Locations:");
        for (Dealership dealer : dealerList) {
            System.out.println();
            System.out.println("Dealership ID: " + dealer.getDealershipID());
            System.out.println("Name: " + dealer.getName());
            System.out.println("Address: " + dealer.getAddress());
            System.out.println("Phone Number: " + dealer.getPhoneNumber());
        }
    }
}





