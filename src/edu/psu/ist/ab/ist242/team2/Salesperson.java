/*
Project: Car Dealership
Purpose Details: Creates object salesperson using setters and getters. Also contains method for selling parts.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/28/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.Scanner;
import java.util.*;

public class Salesperson {

    private double commission;
    protected String empFirstName, empLastName, phoneNumber, empEmail, empID, location;

    Scanner userInput = new Scanner(System.in);

    Hashtable<String, Double> salary = new Hashtable<String, Double>();

    // create method getSalespersonByID() find sp by their id


    // Add salesLead - new customer
    public void addSalesLead(String empID) {
        // ask for id

        String input = userInput.nextLine();
        empID = input;
        SalesLead sl = new SalesLead();
        sl.addSL(empID);

    }




    // repeated customer - get their id - create for loop

    // dealership, salesPersonID




    // sellParts remove parts object from ArrayList PartsList - remove from inventory

    // addCar addParts to inventory




    // add new customer and salesLead - to know which salesperson added customer/salesLead


// Give discount

    public void salesPeopleWork() { }


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

    public void setVLocation(String _location) {
        this.location = _location;
    }

    public String getVLocation() {
        return location;
    }

}
