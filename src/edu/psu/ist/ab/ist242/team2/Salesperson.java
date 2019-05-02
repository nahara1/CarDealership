/*
Project: Car Dealership
Purpose Details: Creates object salesperson using setters and getters.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 5/1/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.Scanner;
import java.util.*;
import java.util.Hashtable;
import java.util.HashMap;

public class Salesperson {
    /**
     * Employee's commission, first and last names phone number, email, and location
     * Employee ID is a unique number for each employee
     */
    
    private double commission;
    protected String empFirstName, empLastName, phoneNumber, empEmail, location;
    public static String empID;
    Scanner userInput = new Scanner(System.in);

    // create method getSalespersonByID() find sp by their id
    // Add salesLead - new customer

    /**
     * addSalesLead method adds a new sales lead to the dealership
     * @param empID
     * @author Ronald
     */
    public void addSalesLead(String empID) {
        // ask for id
        String input = userInput.nextLine();
        empID = input;
        SalesLead sl = new SalesLead();
        sl.addSL(empID);

    }

    /**
     * Salesperson empID getter
     * @return String empID
     */

    public String getEmpID() {return empID;} // get random number

    /**
     * Salesperson empID setter
     * @return String empID
     */

    public void setEmpID(String _empID) {this.empID = _empID;}

    /**
     * Salesperson empFirstName getter
     * @return String empFirstName
     */

    public String getEmpFirstName() {return empFirstName;}

    /**
     * Salesperson empFirstName setter
     * @return String empFirstName
     */

    public void setEmpFirstName(String _empFirstName) {this.empFirstName = _empFirstName;}

    /**
     * Salesperson empLastName getter
     * @return String empLastName
     */

    public String getEmpLastName() {return empLastName;}

    /**
     * Salesperson empFirstName setter
     * @return String empFirstName
     */

    public void setEmpLastName(String _empLastName) {this.empLastName = _empLastName;}

    /**
     * Salesperson phoneNumber getter
     * @return String phoneNumber
     */

    public String getPhoneNumber() {return phoneNumber;}

    /**
     * Salesperson phoneNumber setter
     * @return String phoneNumber
     */

    public void setPhoneNumber(String _PhoneNumber) {this.phoneNumber = _PhoneNumber;}

    /**
     * Salesperson empEmail getter
     * @return String empEmail
     */

    public String getEmpEmail() {return empEmail;}

    /**
     * Salesperson empEmail setter
     * @return String empEmail
     */

    public void setEmpEmail(String _empEmail) {this.empEmail = _empEmail;}

    /**
     * Salesperson location setter
     * @return String location
     */
    
    public void setLocation(String _location) {this.location = _location;}

    /**
     * Salesperson location getter
     * @return String location
     */

    public String getLocation() {return location;}

    /**
     * printSalesperson method lists salesperson information
     * @param salespersonArrayListList salesperson Array List
     * @author Narrara
     */
    public static void printSalesperson(ArrayList<Salesperson> salespersonArrayListList, String _id) {
        for (Salesperson sp : salespersonArrayListList) {
            if (sp.empID.equals(_id)) {
                System.out.printf("%-10s | %-12s | %-10s \n", sp.getEmpFirstName(), sp.getEmpLastName(), sp.getEmpEmail());
            }
        }
    }
}
