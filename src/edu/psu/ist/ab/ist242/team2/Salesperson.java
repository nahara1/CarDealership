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
     * employee ID getter
     * @return
     */

    public String getEmpID() {return empID;} // get random number
    public void setEmpID(String _empID) {this.empID = _empID;}

    public String getEmpFirstName() {return empFirstName;}
    public void setEmpFirstName(String _empFirstName) {this.empFirstName = _empFirstName;}

    public String getEmpLastName() {return empLastName;}
    public void setEmpLastName(String _empLastName) {this.empLastName = _empLastName;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String _PhoneNumber){this.phoneNumber = _PhoneNumber;}

    public String getEmpEmail() {return empEmail;}
    public void setEmpEmail(String _empEmail){this.empEmail = _empEmail;}


    public static void printSalesperson(ArrayList<Salesperson> salespersonArrayListList, String _id) {
        for (Salesperson sp : salespersonArrayListList) {
            if (sp.empID.equals(_id)) {
                System.out.printf("%-10s | %-12s | %-10s \n", sp.getEmpFirstName(), sp.getEmpLastName(), sp.getEmpEmail());
            }
        }
    }

    public void setLocation(String _location) {
        this.location = _location;
    }

    public String getLocation() {
        return location;
    }

}
