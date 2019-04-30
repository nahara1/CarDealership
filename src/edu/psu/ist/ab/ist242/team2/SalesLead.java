package edu.psu.ist.ab.ist242.team2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class SalesLead {
    /**
     * Sales Lead unique identification number
     */
    protected int salesLeadID;

    /**
     *
     */
    protected String sl_firstName, sl_lastName, sl_phoneNumber, sl_Email, empID;
    protected Boolean salesLeadActive;
    protected String salesLeadDate;
    int cCount;


    // Constructors

    /**
     * SalesLead constructor requiring sales lead ID
     * @param _id
     */
    public SalesLead(int _id) {
        this.salesLeadID = _id;
    }

    /**
     * SalesLead constructor
     */
    public SalesLead() { }

    /**
     * addSL method adds a new SalesLead
     * <p>
     *   The addSL method prompts user to enter
     *   Employee ID, SalesLead full name, date, phone number, and email,
     *   to be stored in the inventory.
     * </p>
     * @return a sl object
     */
    // add salesPeople id to know which one added a salesLead
    public SalesLead addSL(String _empID) {
        SalesLead sl = new SalesLead(cCount++);
        Scanner scnr = new Scanner(System.in);
        // fix this
        System.out.println("Employee ID: " + _empID);
        sl.setSL_empID(_empID);

        System.out.println("Please enter SL first name: ");
        sl_firstName = testAlpha(getInput());
        sl.setSl_firstName(sl_firstName);

        System.out.println("Please enter SL last name: ");
        sl_lastName = testAlpha(getInput());
        sl.setSl_lastName(sl_lastName);

        System.out.println("Please enter date: ");
        salesLeadDate = testDate(getInput());
        sl.setSl_Date(salesLeadDate);

        System.out.println("Please enter SL phone number: ");
        sl_phoneNumber = testPhone(getInput());
        sl.setSl_phoneNumber(sl_phoneNumber);

        System.out.println("Please enter SL email: ");
        sl_Email = testEmail(getInput());
        sl.setSl_Email(sl_Email);

        sl.setSalesLeadID(cCount);


        return sl;
    }

    /**
     * Sales Lead ID getter
     * @return Sales Lead ID
     */


    public int getSalesLeadID() {
        return salesLeadID;
    }

    /**
     * Sales Lead ID setter
     * @param _salesLeadID
     */

    public void setSalesLeadID(int _salesLeadID) {
        this.salesLeadID = _salesLeadID;
    }

    /**
     * Sales Lead first name getter
     * @return
     */
    public String getSl_firstName() {
        return sl_firstName;
    }


    /**
     * Sales Lead first name setter
     * @return
     */
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

    private void setSL_empID(String _empID) {
        this.empID = _empID;
    }

    private String getSL_empID() {
        return empID;
    }

    public static void printSalesLead(ArrayList<SalesLead> slList) {
        for (SalesLead sales_lead : slList) {
          System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", sales_lead.getSalesLeadID(), sales_lead.getSL_empID(), sales_lead.getSl_firstName() + " " + sales_lead.getSl_lastName(), sales_lead.getSl_phoneNumber(), sales_lead.getSl_Email(), sales_lead.getSl_Date());
           // System.out.println(sales_lead.getSalesLeadID(), sales_lead.getSl_firstName(), sales_lead.getSl_lastName());

            // index of each object
            System.out.println("Index: " + slList.indexOf(sales_lead));

            // use this to count sales lead -
            System.out.println("Number of Sales Lead: " + slList.size());

        }
    }

    /**
     * printSalesLeadById method prints SalesLead that are of a certain ID
     * @param slList
     * @param salesLeadID
     */
    public static void printSalesLeadById(ArrayList<SalesLead> slList, int salesLeadID) {
        for (SalesLead sl : slList) {
            if (sl.salesLeadID == salesLeadID) {
                System.out.printf("%-10s | %-12s | %-10s\n", sl.getSalesLeadID(), sl.getSl_Email(), sl.getSl_phoneNumber());
            }
        }
    }

    /**
     * getInput method prompts user for an input
     *
     * <p>
     *  This method is used inside the addSL method to
     *  ask for information and then through setters
     *  add that information into the sales lead array list.
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

    /**
     * testDate method tests if input contains numbers
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input contains only numbers in a date format.
     * </p>
     *
     * @param date user input
     * @return number
     * @throws InputMismatchException if string tested does not contain
     *                                numbers
     *
     */
    public static String testDate(String date) {
        try {

            if (date.matches("/\\d+[/][\\d][/][\\d]+$")) {
                return date;
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