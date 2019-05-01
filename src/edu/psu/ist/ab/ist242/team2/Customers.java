/*
Project: Car Dealership
Purpose Details: Creates an object customer with user input for information related to the customer. Prints list of all customers.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/28/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.ArrayList;

import java.util.Scanner;

public class Customers {

    /**
     * Unique identification number of each customer and dealership
     */
    private int custID, dealershipID;

    /**
     * Customers first and last names, phone number, and email
     *
     * Group ID is a unique number that groups customers based on their first
     * last name initials
     *
     */
    private String firstName, lastName, phoneNumber, custEmail, groupID;


    /**
     * Counter to automatically generate customer IDs
     */
    int cCount = 00005;

    /**
     * Customers constructor requiring Customer ID
     * @param custID Customer ID
     */
    Customers(int custID) {
    }

    /**
     * Customers constructor
     */
    Customers() {
    }

    // add customer method

    /**
     * addCustomer method adds a new car dealership customer
     *
     * <p>
     *    The addCustomer method prompts user for multiple inputs
     *    to get customer information to be stored in an array list.
     * </p>
     *
     * @return a Customer object
     */
    public Customers addCustomer() {
        Customers cust = new Customers(cCount++);
        Scanner scnr = new Scanner(System.in);

        // ask for dealership id / location ??

        System.out.println("Enter Dealership ID: \n 1 - Abington \n 2 - Bensalem ");
        int dealershipID = scnr.nextInt();
        cust.setDealershipID(dealershipID);

        System.out.println("Please enter customer first name: ");
        firstName = Exception.testAlpha(Exception.getInput());
        cust.setFirstName(firstName);


        System.out.println("Please enter customer last name: ");
        lastName = Exception.testAlpha(Exception.getInput());
        cust.setLastName(lastName);

        System.out.println("Please enter customer phone number:  \n Please use this format: (012) 345-6789 ");
        phoneNumber = Exception.testPhone(Exception.getInput());
        cust.setPhoneNumber(phoneNumber);

        System.out.println("Please enter customer email: ");
        custEmail = Exception.testEmail(Exception.getInput());
        cust.setCustEmail(custEmail);

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
            System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", cust.getCustID(), cust.getFirstName(), cust.getLastName(), cust.getcustEmail(), cust.getPhoneNumber());

        }
    }

    /**
     * printCustByDealershipID method lists customers information based on dealership's ID
     * @param cList customers Array List
     * @param _id   dealership's id
     */
    public static void printCustByDealershipID(ArrayList<Customers> cList, int _id) {
        for (Customers cust : cList) {
            if (cust.dealershipID == _id) {
                System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", cust.getCustID(), cust.getFirstName(), cust.getLastName(), cust.getcustEmail(), cust.getPhoneNumber());
            }

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

    /**
     * countCustomers method counts the number of dealership customers
     * @param cList customers Array List
     */


    public static void countCustomers(ArrayList<Customers> cList) {
        System.out.println("Customers Total: " + cList.size());
    }

    // still working on this
    private void setDealershipID(int _dealershipID) {
        this.dealershipID = _dealershipID;
    }

    private int getDealershipID() {
        return dealershipID;
    }


    }

