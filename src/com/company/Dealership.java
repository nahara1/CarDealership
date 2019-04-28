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

    // Dealership class constructors

    /**
     * Constructor of the Dealership class
     * @param name         dealership name
     * @param address      dealership address
     * @param phoneNumber  dealership phone number
     */

    public Dealership(String name, String address, String phoneNumber) {}


    /**
     * Constructor of the Dealership class
     */
    public Dealership() {}

    // setters and getters

    /**
     * @return dealership id
     */

    public int getDealershipID() { return dealershipID; }


    /**
     *
     * @param _DealershipID
     */
    public void setDealershipID(int _DealershipID) { this.dealershipID = _DealershipID; }

    /**
     *
     * @return dealership name
     */
    public String getName() { return name; }

    /**
     *
     * @param _Name dealership name
     */
    public void setName(String _Name) { this.name = _Name; }

    /**
     *
     * @return dealership address
     */

    public String getAddress() { return address; }

    /**
     *
     * @param _Address dealership address
     */

    public void setAddress(String _Address) { this.address = _Address; }

    /**
     *
     * @return dealership phone number
     */

    public String getPhoneNumber() { return phoneNumber; }

    /**
     *
     * @param _PhoneNumber dealership phone number
     */

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


    /**
     * getInput method prompts user for an input
     *
     * <p>
     *  This method is used inside the addDealership method to
     *  ask for dealership information and then through setters
     *  add that information into the dealership array list.
     * </p>
     *
     * @return input
     */

    public static String getInput() {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        return input;

    }


    /**
     * testAlpha method tests if input contains alpha characters
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input contains only alpha characters.
     * </p>
     *
     * @param alphaCharacter user input
     * @return a String of alpha characters
     * @throws InputMismatchException if string tested does not contain
     *                                alpha characters
     *
     */
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





