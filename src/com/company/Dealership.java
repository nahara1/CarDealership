package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dealership {

    /**
     * The name, address, and phone number of teh dealership
     */
    private String name, address, phoneNumber;

    /**
     * The dealership unique identification number
     */

    private int dealershipID;

    // dealership constructor

    public Dealership(String name, String address, String phoneNumber) {}

    public Dealership() {}

    // setters and getters

    /**
     * getDealershipID method lists customers information
     *
     */



    public int getDealershipID() { return dealershipID; }

    public void setDealershipID(int _DealershipID) { this.dealershipID = _DealershipID; }

    public String getName() { return name; }

    public void setName(String _Name) { this.name = _Name; }

    public String getAddress() { return address; }

    public void setAddress(String _Address) { this.address = _Address; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String _PhoneNumber) { this.phoneNumber = _PhoneNumber; }

    // list information for all dealerships

    /**
     * listDealerships prints dealership information
     * @param dealerList dealership array list
     */

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

    public static String getInput() {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        return input;

    }

    public static String testAlpha(String alphaCharacter) {
        try {

            if (alphaCharacter.matches("^[a-zA-Z]*$")) {
                return alphaCharacter;
            }
            else  {
                throw new InputMismatchException("not alpha");
            }
        }
        catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Please try again.");
            return getInput();
        }
    }
}





