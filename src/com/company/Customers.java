package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
    int cCount = 00001;

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

        System.out.println("Enter Dealership ID: ");
        int dealershipID = scnr.nextInt();
        cust.setDealershipID(dealershipID);

        System.out.println("Please enter customer first name: ");
        firstName = testAlpha(getInput());
        cust.setFirstName(firstName);


        System.out.println("Please enter customer last name: ");
        lastName = testAlpha(getInput());
        cust.setLastName(lastName);

        System.out.println("Please enter customer phone number:  \n Please use this format: (012) 345-6789 ");
        phoneNumber = testPhone(getInput());
        cust.setPhoneNumber(phoneNumber);

        System.out.println("Please enter customer email: ");
        custEmail = testEmail(getInput());
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
/*


    public static void countCustomersByDealership(ArrayList<Customers> cList, int _cdID) {
        System.out.println("Customers Total: " + cList.size());

    }
*/

    /**
     * getInput method prompts user for an input
     *
     * <p>
     *  This method is used inside the addCustomer method to
     *  ask for customer information and then through setters
     *  add that information into the customer array list.
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

        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Please try again.");
            return getInput();

        }

    }

    /**
     * testEmail method tests if input matches an email format
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input follows a standard email format.
     * </p>
     *
     * @param email user input
     * @return an email address
     * @throws InputMismatchException if string tested does not match
     *                                email format
     *
     */
    public static String testEmail(String email) {
        try {

            if (email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                return email;
            }
            else  {
                throw new InputMismatchException("invalid");
            }



        } catch (InputMismatchException notAnEmail) {
            System.out.println("Invalid input. Please try again.");
            return getInput();

        }
    }

    /**
     * testPhone method tests if input matches a phone number format
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input follows a standard phone number format.
     * </p>
     *
     * @param phone user input
     * @return a phone number
     * @throws InputMismatchException if input tested does not match
     *                                phone number format
     *
     */
    public static String testPhone(String phone) {
        try {

            if (phone.matches("^[(]+[0-9]+[)]+[\\s]+[0-9]+[-]+[0-9]+$")) {
                return phone;
            }
            else  {
                throw new InputMismatchException("invalid");
            }



        } catch (InputMismatchException notAnEmail) {
            System.out.println("Invalid input. Please try again.");
            return getInput();

        }
    }


    // still working on this
    private void setDealershipID(int _dealershipID) {
        this.dealershipID = _dealershipID;
    }

    private int getDealershipID() {
        return dealershipID;
    }


    }

