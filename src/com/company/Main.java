
package com.company;


import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Team 2
 * @version
 * @since
 */

public class Main {

    public static void main(String[] args) {

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

        ArrayList<Transaction> transList = new ArrayList<> ();

        // objects for each class for adding them to arrayLists
        Car car = new Car ();
        Inventory inv = new Inventory ();
        Truck truck = new Truck ();
        Parts parts = new Parts ();
        Transaction tran = new Transaction ();


        Salesperson sp = new Salesperson ();
        SalesLead sl = new SalesLead ();


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
        car1.setPrice(20000);

        Car car2 = new Car ("1A4K5L");
        carList.add(car2);
        car2.setColor("Red");
        car2.setYear(2017);
        car2.setModel("Hatchback");
        car2.setMaker("Volkswagen");
        car2.setName("Name2");
        car2.setPrice(30000);

        Car car3 = new Car ("2B6F9S");
        carList.add(car3);
        car3.setColor ("White");
        car3.setYear(2010);
        car3.setModel("Hatchback");
        car3.setMaker("Chevrolet");
        car3.setName("Name3");
        car3.setPrice(21000);

        Car car4 = new Car ("3D1G7T");
        carList.add(car4);
        car4.setColor ("Green");
        car4.setYear(2008);
        car4.setModel("Coupe");
        car4.setMaker("Honda");
        car4.setName("Name4");
        car4.setPrice(19000);

        Car car5 = new Car ("6H3M2X");
        carList.add(car5);
        car5.setColor("Yellow");
        car5.setYear(2008);
        car5.setModel("Minivan");
        car5.setMaker ("Toyota");
        car5.setName("Name5");
        car5.setPrice(39000);


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


        //Get quantity in inventory


        //Customer's information
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
        cust1.setPhoneNumber("(123)-456-7890");
        cust1.setCustEmail ("annsmith@aol.com");
        cList.add(cust1);

        cust2.setFirstName ("Joe");
        cust2.setLastName ("Oakes");
        cust2.setCustID (00002);
        cust2.setGroupID ("JO");
        cust2.setPhoneNumber("(321)-456-7890");
        cust2.setCustEmail ("jxo@psu.edu");
        cList.add(cust2);

        cust3.setFirstName ("Alex");
        cust3.setLastName ("Hirsh");
        cust3.setCustID (00003);
        cust3.setGroupID ("AL");
        cust3.setPhoneNumber("(213)-456-7890");
        cust3.setCustEmail("ahirsh@psu.edu");
        cList.add(cust3);

        cust4.setFirstName ("Ronald");
        cust4.setLastName ("Salguero");
        cust4.setCustID (00004);
        cust4.setGroupID ("RS");
        cust4.setPhoneNumber("(111)-456-7890");
        cust4.setCustEmail ("ris5534@psu.edu");
        cList.add(cust4);

        cust5.setFirstName ("Hannah");
        cust5.setLastName ("Montana");
        cust5.setCustID (5);
        cust5.setGroupID ("HM");
        cust5.setPhoneNumber("(111)-456-7890");
        cust5.setCustEmail ("hmontana@yahoo.com");
        cList.add(cust5);


        // Transactions
        Transaction tran1 = new Transaction();
        tran1.setTransactionId(1);
        tran1.setSubTotal(19999);
        tran1.setTotalPrice(21198.94);
        tran1.setPaymentType(PaymentType.cash);
        transList.add(tran1);

        Transaction tran2 = new Transaction();
        tran2.setTransactionId(2);
        tran2.setSubTotal(28000);
        tran2.setTotalPrice(29680);
        tran2.setPaymentType(PaymentType.credit);
        transList.add(tran2);

        Transaction tran3 = new Transaction();
        tran3.setTransactionId(3);
        tran3.setSubTotal(40000);
        tran3.setTotalPrice(42400);
        tran3.setPaymentType(PaymentType.credit);
        transList.add(tran3);


        //SalesLead - add information (name, phone number, email, salespeople id)
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
        final char TRANLIST_CODE = '0';


        final char SEARCH_CODE = 'S';
        final char HELP_CODE = '?';
        final char EXIT_CODE = '!';

        char userAction;

        final String PROMPT_ACTION = "\n 1 - Add Customer\n 2 - Print List of Customers\n 3 - Print Sales Lead List \n 4 - Add Sales Lead\n 5 - List Inventory\n 6 - Add a Vehicle\n 7 - Add Parts\n 8 - Sell a Vehicle\n 9 - Add a Transaction\n 0 - Print List of Transactions\n S - Search Vehicle and Parts\n ? - Help\n ! - Quit\n ";


        // prompt user
        System.out.println ("DEALERSHIP MAIN MENU");
        userAction = getAction (PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            Scanner input = new Scanner (System.in);
            switch (userAction) {
                case CUST_CODE:
                    cList.add(cust.addCustomer());
                    //cust.printCustomerById(cList, 1);


                    break;
                case CUST_PRNT:
                    System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", "ID", "First Name", "Last Name", "Email", "Phone Number");
                    Customers.printCustomer(cList);

                    //SalesLead.printSalesLead(slList);

                    break;

                case SL_PRNT:

                    // to do - print salesperson id as well
                    System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", "ID", "Employee ID", "Name", "Phone Number", "Email", "Date Added");
                    SalesLead.printSalesLead(slList);

                    SalesLead.printSalesLeadById(slList, 1);
                    break;

                case SELL_CODE:
                    System.out.println("Enter Type ('car'/'truck'/'parts'): ");
                    String invType = input.nextLine().toLowerCase();
                    // method to get car/truck/parts by id

                    switch (invType) {
                        case "car":
                            System.out.println("Enter VIN:");
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
                    System.out.println("Enter your emp id: ");
                    String emp_id = input.next();
                    slList.add(sl.addSL(emp_id));

                    break;

                case INV_CODE:
                    System.out.println("Enter Vehicle Type ('car'/'truck'): ");
                    String type = input.nextLine().toLowerCase();
                    switch (type) {
                        case "car":
                            car.printCars(carList);

                            break;
                        case "truck":
                            truck.printTrucks(truckList);

                            break;
                        case "parts":
                            parts.printParts(partsList);

                            break;
                    }
                    break;


                case SEARCH_CODE:

                    Scanner scnr = new Scanner(System.in);

                    System.out.println("Enter Type ('color'/'model'/'maker'/'VIN'): ");
                    String searchType = input.nextLine().toLowerCase();
                    // method to get car/truck/parts by id

                    switch (searchType) {
                        case "color":

                            System.out.println("Please enter color: ");
                            String input_ = scnr.nextLine();

                            Car.printCarByColor(carList, input_);


                            break;
                        case "maker":

                            System.out.println("Please enter maker: ");
                            input_ = scnr.nextLine();

                            Car.printCarByColor(carList, input_);

                            break;
                        case "model":

                            System.out.println("Please enter model: ");
                            input_ = scnr.nextLine();

                            Car.printCarByModel(carList, input_);

                            break;
                        case "VIN":
                            System.out.println("Please enter VIN: ");
                            input_ = scnr.nextLine();

                            //Car.printCarBy(carList, input_);

                            break;
                    }
                    break;


                case ADD_PARTS:
                    partsList.add(parts.addParts());

                    break;

                case ADD_VEHICLE:
                    //String userInput = "Type 1 to add a car or 2 to add a truck";
                    //userAction = getAction(userInput);

                    //while (userAction != 'E') {

                    System.out.println ("Enter Vehicle Type ('car'/'truck'): ");
                    String inv_type = input.nextLine().toLowerCase();

                    switch (inv_type) {
                        case "car":
                            carList.add (car.addCar());


                            break;
                        case "truck":
                            truckList.add (truck.addTruck());

                            break;
                    }

                    break;

                case TRAN_CODE:
                    transList.add(tran.addTransaction());

                    break;

                case TRANLIST_CODE:
                    tran.listTransactions(transList);

                    break;

                case HELP_CODE:
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









