package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SalesLead {
    protected int salesLeadID;
    protected String sl_firstName, sl_lastName, sl_phoneNumber, sl_Email;
    protected Boolean salesLeadActive;
    protected String salesLeadDate, empID;
    int cCount;

    private int salesPersonID;

    public ArrayList<SalesLead> slList = new ArrayList<>();


    // Constructors
    public SalesLead(int _id) {
        this.salesLeadID = _id;
    }

    public SalesLead() {
    }


    // add salesPeople id to know which one added a salesLead
    public SalesLead addSL(String _empID) {
        SalesLead sl = new SalesLead(cCount++);
        Scanner scnr = new Scanner(System.in);
        // fix this
        System.out.println("Employee ID: " + _empID);
        sl.setSL_empID(empID);
        System.out.println("Please enter SL first name: ");
        sl.setSl_firstName(scnr.nextLine());
        System.out.println("Please enter SL last name: ");
        sl.setSl_lastName(scnr.nextLine());
        System.out.println("Please enter date: ");
        sl.setSl_Date(scnr.nextLine());
        System.out.println("Please enter SL phone number: ");
        sl.setSl_phoneNumber(scnr.nextLine());
        System.out.println("Please enter SL email: ");
        sl.setSl_Email(scnr.nextLine());
        sl.setSalesLeadID(cCount);

        return sl;
    }



    public int getSalesLeadID() {
        return salesLeadID;
    }

    public void setSalesLeadID(int _salesLeadID) {
        this.salesLeadID = _salesLeadID;
    }

    public String getSl_firstName() {
        return sl_firstName;
    }

    public void setSl_firstName(String _sl_firstName) {
        this.sl_firstName = _sl_firstName;
    }

    public String getSl_lastName() {
        return sl_lastName;
    }

    public void setSl_lastName(String _sl_lastName) {
        this.sl_lastName = _sl_lastName;
    }

    public String getSl_phoneNumber() {
        return sl_phoneNumber;
    }

    public void setSl_phoneNumber(String _sl_phoneNumber) {
        this.sl_phoneNumber = _sl_phoneNumber;
    }

    public String getSl_Email() {
        return sl_Email;
    }

    public void setSl_Email(String _sl_Email) {
        this.sl_Email = _sl_Email;
    }

    public String getSl_Date() {
        return salesLeadDate;
    }

    public void setSl_Date(String _sl_Date) {
        this.salesLeadDate = _sl_Date;
    }

    public void setSL_empID(String _empID) {
        this.empID = _empID;
    }

    public String getSL_empID() {
        return empID;
    }

    public static void printSalesLead(ArrayList<SalesLead> slList) {
        for (SalesLead sales_lead : slList) {
          System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", sales_lead.getSalesLeadID(), sales_lead.getSL_empID(), sales_lead.getSl_firstName() + " " + sales_lead.getSl_lastName(), sales_lead.getSl_phoneNumber(), sales_lead.getSl_Email(), sales_lead.getSl_Date());
           // System.out.println(sales_lead.getSalesLeadID(), sales_lead.getSl_firstName(), sales_lead.getSl_lastName());

            // index of each object
            // System.out.println("Index: " + slList.indexOf(sales_lead));

            // use this to count sales lead -
            System.out.println("Number of Sales Lead: " + slList.size());
        }
    }

    public static void printSalesLeadById(ArrayList<SalesLead> slList, int salesLeadID) {
        for (SalesLead sl : slList) {
            if (sl.salesLeadID == salesLeadID) {
                System.out.printf("%-10s | %-12s | %-10s\n", sl.getSalesLeadID(), sl.getSl_Email(), sl.getSl_phoneNumber());
            }
        }
    }


    public static String getInput() {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        return input;
    }

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
}