package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Customers {


    private int custID;
    private String firstName, lastName, phoneNumber, custEmail, groupID;
    int cCount = 10;

    /**
     * Customer constructor
     * @param custID customer ID
     */

    Customers(int custID) {
    }

    Customers() {
    }

    // add customer method

    /**
     * addCustomer method adds a new car dealership customer
     * @return a Customer object
     */



    public Customers addCustomer() {
            Customers cust = new Customers(cCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please enter customer first name: ");
            cust.setFirstName(scnr.nextLine());
            System.out.println("Please enter customer last name: ");
            cust.setLastName(scnr.nextLine());
            System.out.println("Please enter customer phone number: ");
            cust.setPhoneNumber(scnr.nextLine());
            System.out.println("Please enter customer email: ");
            cust.setCustEmail(scnr.nextLine());

            cust.setCustID(cCount);


            return cust;
        }

    //Group customers based on their last name (asc order).
    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String _GroupID) {
        this.groupID = _GroupID;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int _CustID) {
        this.custID = _CustID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String _FirstName) {
        this.firstName = _FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String _LastName) {
        this.lastName = _LastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String _PhoneNumber) {
        this.phoneNumber = _PhoneNumber;
    }

    public String getcustEmail() {
        return custEmail;
    }

    public void setCustEmail(String _email) {
        this.custEmail = _email;
    }


    /**
     * printCustomer method lists customers information
     * @param cList customers Array List
     */

    public static void printCustomer(ArrayList<Customers> cList) {
        for (Customers cust : cList) {
            //System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.printf("%-10s | %-12s | %-10s\n", cust.getCustID(), cust.getcustEmail(), cust.getPhoneNumber());

        }
    }



    /**
     * printCustomerById method lists customer information based on a given ID
     * @param cList customers Array List
     * @param custId an integer number
     */

    // method to print a specific customer

        public static void printCustomerById(ArrayList<Customers> cList, int custId) {
            for (Customers cust : cList) {
                if (cust.custID == custId) {
                    System.out.printf("%-10s | %-12s | %-10s\n", cust.getCustID(), cust.getcustEmail(), cust.getPhoneNumber());
                }
            }
        }

    public static void testAlpha(String alphaCharacter) {
        try {

            if (alphaCharacter.matches("^[a-zA-Z]*$")) {
                return;
            }
            else  {
                throw new InputMismatchException("not alpha");
            }


        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. You did not enter an alpha character. Please try again.\n");


        }
    }


        // add method purchaseCar
    }

