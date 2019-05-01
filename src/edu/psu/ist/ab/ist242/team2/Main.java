/*
Project: Car Dealership
Purpose Details: To create a Java text-based console application for a car dealership
Course: IST 242 - 001
Team: 2
Date Developed: 2/15
Last Date Changed: 4/30
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;


import java.util.*;


/**
 * @author Narrara, JiaJia, Alex, Ronald, Jeff, Jason
 * @version 1
 * @since 2/15/2019
 */

public class Main {

    public static void main(String[] args) {

        /**
         * Array List that stores objects of the Customers class
         */

        ArrayList<Customers> cList = new ArrayList<> ();

        /**
         * Customer object
         */
        Customers cust = new Customers ();

        /**
         * Array List that stores objects of the Dealership class
         */


        //Dealerships

        /**
         * Dealership class objects
         */

        Dealership dealer1 = new Dealership ();
        dealer1.setDealershipID (1);
        dealer1.setName ("Car Dealership Abington");
        dealer1.setAddress ("123 St Ave Town, PA 12345");
        dealer1.setPhoneNumber ("123456789");

        Dealership dealer2 = new Dealership ();
        dealer2.setDealershipID (2);
        dealer2.setName ("Car Dealership Bensalem");
        dealer2.setAddress ("234 St Ave Town, PA 54232");
        dealer2.setPhoneNumber ("234567890");

        ArrayList<Dealership> dealerList = new ArrayList<> ();
        dealerList.add (dealer1);
        dealerList.add (dealer2);


        ArrayList<SalesLead> slList = new ArrayList<> ();
        ArrayList<SalesLead> slList2 = new ArrayList<> ();

        ArrayList<Car> carList = new ArrayList<> ();
        ArrayList<Car> carList2 = new ArrayList<> ();

        ArrayList<Truck> truckList = new ArrayList<> ();
        ArrayList<Truck> truckList2 = new ArrayList<> ();

        ArrayList<Parts> partsList = new ArrayList<> ();

        ArrayList<Transaction> transList = new ArrayList<> ();

        // objects for each class for adding them to arrayLists

        Car car = new Car ();
        Inventory inv = new Inventory ();
        Truck truck = new Truck ();
        Parts parts = new Parts ();
        Transaction tran = new Transaction ();
        Dealership deal = new Dealership ();
        Salesperson sp = new Salesperson ();
        SalesLead sl = new SalesLead ();

        //SalesLead

        /**
         * Creating Sales persons to add to sales person list
         * @param _id              SalesLead ID
         * @param _salesLeadDate    SalesLead Date
         * @param _sl_location      Location that SalesLead is at
         * @param _sl_Email         SalesLead email address
         * @param _sl_firstName     SalesLead first name
         * @param _sl_lastName      SalesLead last name
         * @param _sl_phoneNumber   SalesLead phone number
         * @param _empID            Employee ID number
         * @author Narrara & JiaJia
         */

        SalesLead sl1 = new SalesLead (1, "02/04/2019", "Abington", "Crystal@gmail.com", "Crystal", "Johnson", "(215)-908-2341", "ABC1");
        SalesLead sl2 = new SalesLead (2, "04/01/2012", "Bensalem", "Ashley@gmail.com", "Ashley", "White", "(215)-789-2091", "A3F6");

        //SalesPeople

        /**
         * Creating Sales persons to add to sales person list
         * @param EmpID             Employee ID number
         * @param EmpEmail          Employee email address
         * @param EmpFirstName      Employee first name
         * @param EmpLastName       Employee last name
         * @param PhoneNumber       Employee phone number
         * @param Location          Location that employee is at
         * @author Alex Hirsh
         */

        Salesperson sp1 = new Salesperson ();
        sp1.setEmpID ("ABC1");
        sp1.setEmpEmail ("carlover123@gmail.com");
        sp1.setEmpFirstName ("Jimmy");
        sp1.setEmpLastName ("Butler");
        sp1.setPhoneNumber ("215-512-1215");
        sp1.setLocation ("Abington");

        Salesperson sp2 = new Salesperson ();
        sp2.setEmpID ("A3F6");
        sp2.setEmpEmail ("bensalemcdealer25@aol.com");
        sp2.setEmpFirstName ("Jesse");
        sp2.setEmpLastName ("Doyle");
        sp2.setPhoneNumber ("410-547-2453");
        sp2.setLocation ("Bensalem");

        Salesperson sp3 = new Salesperson ();
        sp3.setEmpID ("H5K9");
        sp3.setEmpEmail ("tonystark14@gmail.com");
        sp3.setEmpFirstName ("Tony");
        sp3.setEmpLastName ("Stark");
        sp3.setPhoneNumber ("267-834-9120");
        sp3.setLocation ("Abington");


        // Cars

        /**
         * Creating Cars to add to Car list in inventory
         * @param Color         Color of car
         * @param Year          Year of car
         * @param Model         Name of car
         * @param Maker         Company that manufactured car
         * @param NumofDoors    Number of doors car has
         * @param Price         Price of car
         * @author Alex Hirsh
         */

        Car car1 = new Car ("1A2B3C");
        carList.add (car1);
        car1.setColor ("Black");
        car1.setYear (2013);
        car1.setModel ("Sedan");
        car1.setMaker ("Ford");
        car1.setName ("Name");
        car1.setVLocation ("Abington");
        car1.setNumOfDoors (NumDoors.two);
        car1.setPrice (20000);

        Car car2 = new Car ("1A4K5L");
        carList.add (car2);
        car2.setColor ("Red");
        car2.setYear (2017);
        car2.setModel ("Hatchback");
        car2.setMaker ("Volkswagen");
        car2.setName ("Name2");
        car2.setNumOfDoors (NumDoors.four);
        car2.setVLocation ("Bensalem");
        car2.setPrice (30000);

        Car car3 = new Car ("2B6F9S");
        carList.add (car3);
        car3.setColor ("White");
        car3.setYear (2010);
        car3.setModel ("Hatchback");
        car3.setMaker ("Chevrolet");
        car3.setName ("Name3");
        car3.setNumOfDoors (NumDoors.two);
        car3.setVLocation ("Abington");
        car3.setPrice (21000);

        Car car4 = new Car ("3D1G7T");
        carList.add (car4);
        car4.setColor ("Green");
        car4.setYear (2008);
        car4.setModel ("Coupe");
        car4.setMaker ("Honda");
        car4.setName ("Name");
        car4.setVLocation ("Bensalem");
        car4.setNumOfDoors (NumDoors.four);
        car4.setPrice (19000);

        Car car5 = new Car ("6H3M2X");
        carList.add (car5);
        car5.setColor ("Yellow");
        car5.setYear (2008);
        car5.setModel ("Sedan");
        car5.setMaker ("Volkswagen");
        car5.setName ("Name");
        car5.setVLocation ("Abington");
        car5.setNumOfDoors (NumDoors.two);


        // Trucks

        /**
         * Creating Trucks to add to Truck list in inventory
         * @param VIN   Truck VIN number
         * @param Ton   Truck Weight in Tonnage
         * @author Alex Hirsh
         */


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


        //Parts
        /**
         * Creating parts to add to part list
         * @param PartName      Name of part
         * @param PartID        Parts ID number
         * @param Category      Category part belongs to
         * @param Price         Price of part
         * @param Location      Dealership part is located at
         * @author Alex Hirsh
         */

        Parts p1 = new Parts ();
        partsList.add (p1);
        p1.setPartName ("O2 Sensor");
        p1.setPartID (4671);
        p1.setCategory (PartsCategory.electronic);
        p1.setPrice (23.50);
        p1.setLocation ("Abington");

        Parts p2 = new Parts ();
        partsList.add (p2);
        p2.setPartName ("Head Gasket");
        p2.setPartID (5671);
        p2.setCategory (PartsCategory.engine);
        p2.setPrice (35.50);
        p2.setLocation ("Bensalem");

        Parts p3 = new Parts ();
        partsList.add (p3);
        p3.setPartName ("Seat Belt");
        p3.setPartID (6671);
        p3.setCategory (PartsCategory.interior);
        p3.setPrice (55.00);
        p3.setLocation ("Bensalem");

        Parts p4 = new Parts ();
        partsList.add (p4);
        p4.setPartName ("Headlights (pair)");
        p4.setPartID (7771);
        p4.setCategory (PartsCategory.exterior);
        p4.setPrice (200.00);
        p4.setLocation ("Abington");

        Parts p5 = new Parts ();
        partsList.add (p5);
        p5.setPartName ("Brakes (single)");
        p5.setPartID (8581);
        p5.setCategory (PartsCategory.control);
        p5.setPrice (12.75);
        p5.setLocation ("Abington");


        //Inventory

        Inventory in1 = new Inventory ();
        Inventory in2 = new Inventory ();
        Inventory in3 = new Inventory ();
        Inventory in4 = new Inventory ();
        Inventory in5 = new Inventory ();


        //Customer's information

        /**
         * Creating Customers to add to Customer List
         * @param FirstName     customer first name
         * @param LastName      customer last name
         * @param GroupID       customers group ID number
         * @param CustID        customers ID number
         * @param PhoneNumber   customers phone number
         * @param CustEmail     customers email address
         * @author Alex Hirsh, Ronald Salguero
         */
        Customers cust1 = new Customers ();
        Customers cust2 = new Customers ();
        Customers cust3 = new Customers ();
        Customers cust4 = new Customers ();
        Customers cust5 = new Customers ();

        cust1.setFirstName ("Ann");
        cust1.setLastName ("Smith");
        cust1.setGroupID ("AS");
        cust1.setCustID (00001);
        cust1.setGroupID ("A");
        cust1.setPhoneNumber ("(123)-456-7890");
        cust1.setCustEmail ("annsmith@aol.com");
        cList.add (cust1);

        cust2.setFirstName ("Joe");
        cust2.setLastName ("Oakes");
        cust2.setCustID (00002);
        cust2.setGroupID ("JO");
        cust2.setPhoneNumber ("(321)-456-7890");
        cust2.setCustEmail ("jxo@psu.edu");
        cList.add (cust2);

        cust3.setFirstName ("Alex");
        cust3.setLastName ("Hirsh");
        cust3.setCustID (00003);
        cust3.setGroupID ("AL");
        cust3.setPhoneNumber ("(213)-456-7890");
        cust3.setCustEmail ("ahirsh@psu.edu");
        cList.add (cust3);

        cust4.setFirstName ("Ronald");
        cust4.setLastName ("Salguero");
        cust4.setCustID (00004);
        cust4.setGroupID ("RS");
        cust4.setPhoneNumber ("(111)-456-7890");
        cust4.setCustEmail ("ris5534@psu.edu");
        cList.add (cust4);

        cust5.setFirstName ("Hannah");
        cust5.setLastName ("Montana");
        cust5.setCustID (00005);
        cust5.setGroupID ("HM");
        cust5.setPhoneNumber ("(111)-456-7890");
        cust5.setCustEmail ("hmontana@yahoo.com");
        cList.add (cust5);

        /**
         * Creating Transactions to add to Transaction List
         * @param TransactionId     Transaction ID number
         * @param Subtotal          Cost without tax
         * @param TotalPrice        Total Cost with tax
         * @param PaymentType       How the customer paid
         * @param Commission        Perecentage of money that goes to sales lead
         * @author Alex Hirsh
         */

        Transaction tran1 = new Transaction ();
        tran1.setTransactionId (1);
        tran1.setSubTotal (19999);
        tran1.setTotalPrice (21198.94);
        tran1.setPaymentType (PaymentType.cash);
        tran1.setCommission (1999.90);
        tran1.setCommissionID ("ABC1");
        transList.add (tran1);

        Transaction tran2 = new Transaction ();
        tran2.setTransactionId (2);
        tran2.setSubTotal (28000);
        tran2.setTotalPrice (29680);
        tran2.setPaymentType (PaymentType.credit);
        tran2.setCommission (2800);
        tran2.setCommissionID ("A3F6");
        transList.add (tran2);

        Transaction tran3 = new Transaction ();
        tran3.setTransactionId (3);
        tran3.setSubTotal (40000);
        tran3.setTotalPrice (42400);
        tran3.setPaymentType (PaymentType.credit);
        tran3.setCommissionID ("H5K9");
        tran3.setCommission (4000);
        transList.add (tran3);


        //SalesLead - add information (name, phone number, email, salespeople id)
        //SalesLead - add information (name, phone number, email, salespeople id)

        /**
         * Creating Sales Leads to add information for Sales Lead list
         * @param SalesLeadID       Sales Lead's ID number
         * @author Alex Hirsh
         */
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
        final char INV_CODE = '5';
        final char ADD_VEHICLE = '6';
        final char ADD_PARTS = '7';
        final char SELL_CODE = '8';
        final char TRAN_CODE = '9';
        final char TRANLIST_CODE = '0';

        // list dealerships
        final char DEAL_CODE = 'D';

        final char SEARCH_CODE = 'S';

        final char HELP_CODE = '?';

        final char EXIT_CODE = '!';


        char userAction;

        final String PROMPT_ACTION = "\n 1 - Add Customer\n 2 - Print List of Customers\n 3 - Print Sales Lead List \n 4 - Add Sales Lead\n 5 - List Inventory\n 6 - Add a Vehicle\n 7 - Add Parts\n 8 - Sell a Vehicle\n 9 - Add a Transaction\n 0 - Print List of Transactions\n S - Search Vehicle and Parts\n D - List Dealerships\n ? - Help\n ! - Quit\n ";


        // prompt user

        System.out.println ("DEALERSHIP MAIN MENU");
        userAction = getAction (PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            Scanner input = new Scanner (System.in);
            switch (userAction) {
                case CUST_CODE:

                    cList.add (cust.addCustomer ());
                    //cust.printCustomerById(cList, 1);


                    break;
                case CUST_PRNT:
                    System.out.println ("1 - Car Dealership Abington \n2 - Car Dealership Bensalem");
                    int dealership = input.nextInt ();

                    switch (dealership) {
                        case 1:
                            System.out.printf ("%-10s | %-12s |  %-12s | %-12s | %-10s \n", "ID", "First Name", "Last Name", "Email", "Phone Number");
                            Customers.printCustByDealershipID (cList, 1);
                            break;
                        case 2:
                            System.out.printf ("%-10s | %-12s |  %-12s | %-12s | %-10s \n", "ID", "First Name", "Last Name", "Email", "Phone Number");
                            Customers.printCustByDealershipID (cList, 2);
                            break;
                    }

                    break;

                case SL_PRNT:

                    System.out.println ("\n 1 - Print Sales Lead list \n 2 - Print Sales Lead by Employee ID \n 3 - Print Sales Lead Information by ID \n 4 - Print Sales Lead list by location");
                    int print = input.nextInt ();

                    // to do - print salesperson id as well
                    switch (print) {
                        case 1:
                            System.out.printf ("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", "ID", "Employee ID", "Name", "Phone Number", "Email", "Date Added");
                            SalesLead.printSalesLead (slList);
                            break;
                        case 2:
                            System.out.println ("Enter Sales Lead ID: ");
                            int _SL_ID = input.nextInt ();
                            System.out.printf ("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", "ID", "Employee ID", "Name", "Phone Number", "Email", "Date Added");
                            SalesLead.printSalesLeadById (slList, _SL_ID);
                            break;
                        case 3:
                            System.out.println ("Enter employee id: ");
                            String _empID = input.next ();
                            SalesLead.printSalesLeadByEmpID (slList, _empID);
                            break;
                        case 4:
                            System.out.println ("Enter Location \n 1 - Abington \n 2 - Bensalem ");
                            int location = input.nextInt ();
                            System.out.printf ("%-5s | %-12s | %-10s | %-10s | %-12s | %-10s | %-10s\n", "ID", "First Name", "Last Name", "Email", "Phone Number", "Location", "Date Added");
                            if (location == 1) {
                                SalesLead.printSalesLeadByLocation (slList, "Abington");
                            } else if (location == 2) {
                                SalesLead.printSalesLeadByLocation (slList, "Bensalem");
                            }
                            break;

                    }
                    break;

                case SELL_CODE:

                    System.out.println ("Enter Type ('car'/'truck'/'parts'): ");
                    String invType = input.nextLine ().toLowerCase ();

                    switch (invType) {
                        case "car":
                            System.out.println ("Enter VIN:");
                            String vinNum = input.nextLine ();
                            car.sellCar (carList, vinNum);

                            break;
                        case "truck":
                            System.out.println ("Enter VIN:");
                            vinNum = input.nextLine ();
                            truck.sellTruck (truckList, vinNum);

                            break;
                        case "parts":
                            System.out.println ("Enter Item ID:");
                            int partID = input.nextInt ();
                            parts.sellParts (partsList, partID);

                            break;
                    }

                    break;


                case SL_CODE:
                    System.out.println ("Enter your employee id: ");
                    String emp_id = input.next ();
                    slList.add (sl.addSL (emp_id));

                    break;

                case INV_CODE:
                    String inv_type = getType ();
                    System.out.println ("Enter location \n 1 - Abington \n2 - Bensalem:");
                    String _location = input.nextLine ();
                    switch (inv_type) {
                        case "car":
                            car.printCarByLocation (carList, _location);

                            break;
                        case "truck":
                            truck.printTrucksByLocation (truckList, _location);

                            break;
                        case "parts":
                            parts.printPartsByLocation (partsList, _location);

                            break;
                    }
                    break;


                case SEARCH_CODE:
                    inv_type = getType ();
                    switch (inv_type) {
                        case "car":
                            System.out.println ("Enter Type ('color'/'model'/'maker'/'location'): ");
                            String searchType = input.nextLine ().toLowerCase ();
                            Scanner scnr = new Scanner (System.in);

                            switch (searchType) {
                                case "color":

                                    System.out.println ("Please enter color: ");
                                    String input_ = scnr.nextLine ();

                                    Car.printCarByColor (carList, input_);


                                    break;
                                case "maker":

                                    System.out.println ("Please enter maker: ");
                                    input_ = scnr.nextLine ();

                                    Car.printCarByColor (carList, input_);

                                    break;
                                case "model":

                                    System.out.println ("Please enter model: ");
                                    input_ = scnr.nextLine ();

                                    Car.printCarByModel (carList, input_);

                                    break;
                                case "VIN":
                                    System.out.println ("Please enter location ('Abington'/'Bensalem'): ");

                                    input_ = Exception.testLocation(Exception.getInput());

                                    Car.printCarByLocation(carList, input_);

                                    break;
                            }
                        case "parts":
                            System.out.println ("Enter Category (): ");
                            Scanner category = new Scanner (System.in);
                            PartsCategory parts_category = PartsCategory.valueOf (category.next ().toLowerCase ());
                            parts.printPartsByCategory (partsList, parts_category);
                    }


                    break;


                case ADD_PARTS:
                    partsList.add (parts.addParts ());

                    break;

                case ADD_VEHICLE:

                    System.out.println ("Enter Vehicle Type ('car'/'truck':): ");
                    inv_type = input.nextLine ().toLowerCase ();

                    switch (inv_type) {
                        case "car":
                            carList.add (car.addCar ());


                            break;
                        case "truck":
                            truckList.add (truck.addTruck ());

                            break;
                    }

                    break;

                case TRAN_CODE:
                    transList.add (tran.addTransaction ());

                    break;

                case TRANLIST_CODE:
                    tran.listTransactions (transList);

                    break;


                case HELP_CODE:
                    break;

                case DEAL_CODE:
                    deal.listDealerships (dealerList);

                    break;
            }

            userAction = getAction (PROMPT_ACTION);
        }
    }

    /**
     * gets user input
     * @param prompt a char
     * @return a char
     */

    public static char getAction(String prompt) {

        Scanner scnr = new Scanner (System.in);
        String answer = "";
        System.out.println (prompt);
        answer = scnr.nextLine ().toUpperCase () + " ";
        char firstChar = answer.charAt (0);
        return firstChar;
    }

    /**
     * gets type of inventory item
     * @return a String
     */

    public static String getType() {
        Scanner scnr = new Scanner (System.in);
        System.out.println ("Enter Vehicle Type ('car'/'truck'/'parts'): ");
        String type = scnr.nextLine ().toLowerCase ();
        return type;
    }
}