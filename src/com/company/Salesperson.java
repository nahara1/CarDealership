package com.company;

import java.util.Scanner;

public class Salesperson {

    private double commission;
    protected String empFirstName, empLastName, phoneNumber, empEmail, empID;

    Scanner userInput = new Scanner(System.in);
    String input;



    // sellCar - to remove car object from ArrayList CarList - remove from inventory and receive money


    // for loop

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

    public void salesPeopleWork()

    {



}


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

    //public void sellCar()

    public void sellCar() {
        Scanner input_vin = new Scanner(System.in);
        int vin_ = input_vin.nextInt();
        System.out.println("Enter VIN number: ");

        // how to retrieve an object based on vin number

        // remove vehicle from vehiclesList
        // remove(index number)



    }


    //public void sellParts()

    public void sellParts() {
        Scanner input_partID = new Scanner(System.in);
        int idNumber_ = input_partID.nextInt();

        // get parts id to retrieve parts item from parts arrayList
        System.out.println("Enter part ID number: ");

        // remove vehicle from partsList
        // check if there's an item with given id ??
               /*
                if (idNumber_ == (parts.getPartsID)) {

                }

                or
                boolean check = partsList.contains("id");

                if (check) {
                    //do sth
                }else{System.out.println("Try again");}
                */
               // get index and then remove it from arrayList

       // pList.indexOf(parts) ?




    }



   //public void addCar()

   //





}
