/*
Project: Car Dealership
Purpose Details: Creates dealership and prints dealership name address and phone number.
Course: IST 242 - 001
Team: 2
Author: Jeff Bezak
Date Developed: 2/15/2019
Last Date Changed: 4/28/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.ArrayList;

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
     * Dealership Constructor requiring name, address, phone number
     * @param name         dealership name
     * @param address      dealership address
     * @param phoneNumber  dealership phone number
     * @author Jeff Bezak
     */

    public Dealership(String name, String address, String phoneNumber) {}


    /**
     * Dealership Constructor
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
     * @author Jeff Bezak
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
}





