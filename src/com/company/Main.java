
package com.company;


import java.util.ArrayList;
import java.util.Scanner;

//import static com.company.Parts.sellTruck;

/**
 * @author
 * @version
 * @since
 */

public class Main {

    public static void main(String[] args) {

        //comment
        //


        ArrayList<Customers> cList = new ArrayList<> ();
        Customers cust = new Customers ();


        //Dealerships
        Dealership dealer1 = new Dealership ("Car Dealership Abington", "123 St Ave Town, PA 12345", "1234567890");
        Dealership dealer2 = new Dealership ("Car Dealership Bensalem", "123 St Ave Town, PA 12345", "1234567890");

        //ArrayList<Dealership> listDealerships = new ArrayList<>();
        //listDealerships.add(dealer1);
        //listDealerships.add(dealer2);


        ArrayList<SalesLead> slList = new ArrayList<> ();

        ArrayList<Car> carList = new ArrayList<> ();

        ArrayList<Truck> truckList = new ArrayList<> ();

        ArrayList<Parts> partsList = new ArrayList<> ();

        // objects for each class for adding them to arrayLists
        Car car = new Car ();
        Inventory inv = new Inventory ();
        Truck truck = new Truck ();
        Parts parts = new Parts ();


        Salesperson sp = new Salesperson ();
        SalesLead sl = new SalesLead ();
       // Transaction tr1 = new Transaction ();


        //SalesPeople
        Salesperson sp1 = new Salesperson ();
        sp1.setEmpID ("ABC1");

        //Vehicles - objects [done]

        // Cars

        Car car1 = new Car ("1A2B3C");
        carList.add(car1);
        car1.setColor("Black");
        car1.setYear(2013);
        car1.setModel("Sedan");
        car1.setMaker("Ford");
        car1.setName("Name");
        //car1.setDoors('two');



        Car car2 = new Car ("1A4K5L");
        carList.add(car2);
        car2.setColor("Red");
        car2.setYear(2017);
        car2.setModel("Hatchback");
        car2.setMaker("Volkswagen");
        car2.setName("Name2");


        Car car3 = new Car ("2B6F9S");
        carList.add(car3);
        car3.setColor ("White");
        car3.setYear(2010);
        car3.setModel("Hatchback");
        car3.setMaker("Chevrolet");
        car3.setName("Name3");


        Car car4 = new Car ("3D1G7T");
        car4.setColor ("Green");
        car4.setYear(2008);
        car4.setModel("Coupe");
        car4.setMaker("Honda");
        car4.setName("Name4");

        Car car5 = new Car ("6H3M2X");
        car5.setColor("Yellow");


        // Trucks


        Truck truck1 = new Truck ("5C6D7E");
        truck1.setTon (Ton.one);

        Truck truck2 = new Truck ("6T3R1Y");
        truck2.setTon (Ton.one);

        Truck truck3 = new Truck ("9P7O2S");
        truck3.setTon (Ton.two);

        Truck truck4 = new Truck ("5L7F3X");
        truck4.setTon (Ton.one);

        Truck truck5 = new Truck ("8T2Z4G");
        truck5.setTon (Ton.two);


        //Inventory

        //    in1.setCar(car1);


        //Get quantity in inventory


        Inventory in1 = new Inventory ();
        Inventory in2 = new Inventory ();
        Inventory in3 = new Inventory ();
        Inventory in4 = new Inventory ();
        Inventory in5 = new Inventory ();
        Inventory in6 = new Inventory ();
        Inventory in7 = new Inventory ();
        Inventory in8 = new Inventory ();
        Inventory in9 = new Inventory ();
        Inventory in10 = new Inventory ();
//

        /*
        in1.setCar(car1);
        in2.setCar(car2);
        in3.setCar(car3);
        in4.setCar(car4);
        in5.setCar(car5);
        in6.setCar(car6);
        in7.setCar(car7);
        in8.setCar(car8);
        in9.setCar(car9);
        in10.setCar(car10);
            */

//Get quantity in inventory


        //Customers


        Customers cust1 = new Customers ();
        Customers cust2 = new Customers ();
        Customers cust3 = new Customers ();
        Customers cust4 = new Customers ();
        Customers cust5 = new Customers ();


        cust1.setFirstName ("Ann");
        cust1.setGroupID ("A");
        cust1.setPhoneNumber("(123)-456-7890");
        cList.add(cust1);


        cust2.setFirstName ("Joe");
        cust2.setGroupID ("J");
        cust1.setPhoneNumber("(321)-456-7890");
        cList.add(cust2);

        cust3.setFirstName ("Alex");
        cust3.setGroupID ("Al");
        cust1.setPhoneNumber("(213)-456-7890");
        cList.add(cust3);


        cust4.setFirstName ("Ronald");
        cust4.setGroupID ("R");
        cust1.setPhoneNumber("(111)-456-7890");
        cList.add(cust4);

        cust5.setFirstName ("Hannah");
        cust5.setGroupID ("H");
        cust1.setPhoneNumber("(111)-456-7890");
        cList.add(cust5);




//SalesLead
        SalesLead s1 = new SalesLead ();
        s1.setSalesLeadID (0);


        SalesLead s2 = new SalesLead ();
        s2.setSalesLeadID (1);

        SalesLead s3 = new SalesLead ();
        s3.setSalesLeadID (2);

        SalesLead s4 = new SalesLead ();
        s4.setSalesLeadID (3);

        SalesLead s5 = new SalesLead ();
        s5.setSalesLeadID (4);





        // Menu options

        final char CUST_CODE = '1';
        final char CUST_PRNT = '2';
        final char SL_PRNT = '3';
        final char SL_CODE = '4';

        // create methods to print cars and parts inventory
        final char INV_CODE = '5';

        final char ADD_VEHICLE = '6';
        final char ADD_PARTS = '7';

        // add sell method to remove car/parts from array lists by vin and id
        final char SELL_CODE = '8';

        // add method to print receipt
        final char TRAN_CODE = '9';


        final char SEARCH_CODE = 'S';
        final char HELP_CODE = '?';
        final char EXIT_CODE = '!';

        char userAction;

        final String PROMPT_ACTION = "\n 1 - Add Customer\n 2 - Print List of Customers\n 3 - Print Sales Lead List \n 4 - Add Sales Lead\n 5 - List Inventory\n 6 - Add a Vehicle\n 7 - Add Parts\n 8 - Sell a Vehicle\n 9 - List Transactions\n S - Search Vehicle and Parts\n ? - Help\n ";


        // prompt user
        System.out.println ("DEALERSHIP MAIN MENU");
        userAction = getAction (PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            Scanner input = new Scanner (System.in);
            switch (userAction) {
                case CUST_CODE:
                    cList.add (cust.addCustomer ());
                    cust.printCustomerById(cList, 1);


                    break;
                case CUST_PRNT:
                    System.out.printf ("%-10s | %-12s | %-10s\n", "ID", "Name", "Phone Number");
                    Customers.printCustomer (cList);

                    SalesLead.printSalesLead(slList);

                    break;

                case SL_PRNT:

                    // to do - print salesperson id as well
                    System.out.printf ("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", "ID", "Employee ID", "Name", "Phone Number", "Email", "Date Added");
                    SalesLead.printSalesLead(slList);

                    SalesLead.printSalesLeadById(slList, 1);
                    break;

                case SELL_CODE:
                    System.out.println ("Enter Type ('car'/'truck'/'parts'): ");
                    String invType = input.nextLine().toLowerCase();
                    // method to get car/truck/parts by id

                    switch (invType) {
                        case "car":
                            String vinNum = input.nextLine();
                            car.sellCar(carList, vinNum);

                            break;
                        case "truck":
                            vinNum = input.nextLine();
                            truck.sellTruck(truckList, vinNum);

                            break;
                        case "parts":
                            //String partName = input.nextLine();
                            int partID = input.nextInt();
                            parts.sellParts(partsList, partID);

                            break;
                    }

                    break;


                case SL_CODE:
                    System.out.println ("Enter your emp id: ");
                    String emp_id = input.next();
                    slList.add (sl.addSL(emp_id));

                    break;

                case SEARCH_CODE:

                    Scanner scnr = new Scanner(System.in);
                    System.out.println("Please enter color: ");
                    String input_ = scnr.nextLine();

                    // does not work //
                    Car.printCarByColor(carList, input_);



                    //This works
                   // Car.printCarByColor(carList, "Black");


                    /* create menu with car maker/color/year options and then hard code the method
                     * for each option
                     */

                    break;

                case ADD_PARTS:
                    partsList.add(parts.addParts());

                    break;

                case ADD_VEHICLE:
                    //String userInput = "Type 1 to add a car or 2 to add a truck";
                    //userAction = getAction(userInput);

                    //while (userAction != 'E') {

                    System.out.println ("Enter Vehicle Type ('car'/'truck'): ");
                    String type = input.nextLine().toLowerCase();

                    switch (type) {
                        case "car":
                            carList.add (car.addCar());


                            break;
                        case "truck":
                            truckList.add (truck.addTruck());

                            break;
                    }

                    break;

                case TRAN_CODE:
                    break;

                case HELP_CODE: //
                    break;
            }

            userAction = getAction (PROMPT_ACTION);
        }
    }



    public static char getAction(String prompt) {

        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;

    }

 }









