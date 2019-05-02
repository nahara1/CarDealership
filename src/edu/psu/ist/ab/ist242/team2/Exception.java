/*
Project: Car Dealership
Purpose Details: Contains the exceptions for alpha characters, email format, phone number format, price format, date format
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/28/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 * <h1> Custoemers </h1>
 *<p>
 * The Customer class holds the data members and methods that will add customers to the dealership.
 *</p>
 *
 * @author Narrara
 *
 */

public class Exception {

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
     * @author Nahara
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
     * @author Narrara
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
            return testAlpha(getInput());

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
     * @author Narrara
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
            return testEmail(getInput());

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
     * @author Narrara
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
            System.out.println("Invalid input. Please try again. \n Please use this format: (012) 345-6789");
            return testPhone(getInput());

        }
    }
    /**
     * testDouble method tests if input is a double
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input for setting an auto part price
     *  is a double.
     * </p>
     *
     * @param price user input
     * @return a price
     * @throws InputMismatchException if input tested is not a double
     * @author Narrara
     *
     */
    public static String testDouble(String price) {
        try {

            if (price.matches("\\d+\\.\\d*$")) {
                return price;
            }
            else  {
                throw new InputMismatchException("not price");
            }

        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Please try again.");
            return testDouble(getInput());

        }

    }

    /**
     * testInt method tests if input matches numeric characters
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input contains digits only.
     * </p>
     *
     * @param input user input
     * @return integer
     * @throws InputMismatchException if input tested is not an integer
     * @author Narrara
     *
     */
    public static String testInt(String input) {
        try {
            if (input.matches("\\d*$")) {
                return input;
            }
            else  {
                throw new NumberFormatException("not an integer");
            }
        } catch (NumberFormatException notAnInt) {
            System.out.println("Invalid input. You did not enter an integer number. Please try again. \n");
            return testInt(getInput());
        }


    }

    /**
     * testAlphaNumeric method tests if input matches alphanumeric characters
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input contains alphanumeric characters only.
     * </p>
     *
     * @param input user input
     * @return alphanumeric string
     * @throws InputMismatchException if input tested is not alphanumeric
     * @author Narrara & JiaJia
     *
     */
    public static String testAlphaNumeric(String input) {
        try {
            if (input.matches("^[a-zA-Z0-9]*$")) {
                return input;
            } else {
                throw new NumberFormatException("not alphanumeric");
            }
        } catch (NumberFormatException notAnInt) {
            System.out.println("Invalid input. You did not enter alphanumeric characters. Please try again. \n");
            return testAlphaNumeric(getInput());
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
     * @author Narrara
     *
     */
    public static String testDate(String date) {
        try {

            if (date.matches("[0-9]+[/]+[\\d]+[/]+[\\d]*$")) {
                return date;
            }
            else  {
                throw new InputMismatchException("invalid");
            }



        } catch (InputMismatchException notAnEmail) {
            System.out.println("Invalid input. Please try again.");
            return testDate(getInput());

        }
    }

    /**
     * testLocation method tests if input is only either "Abington" or "Bensalem"
     *
     * <p>
     *  This method consists of a try and catch block
     *  to assure user input is only either "Abington" or "Bensalem".
     * </p>
     *
     * @param  input    user input
     * @return input    "Abington" or "Bensalem"
     * @throws InputMismatchException if string tested does not contain
     *                                "Abington" or "Bensalem"
     * @author JiaJia, Narrara & Alex
     */
    public static String testLocation(String input) {
        try {
            if ((input.matches("Abington"))||(input.matches("Bensalem"))) {
                return input;
            } else {
                throw new InputMismatchException("invalid");
            }
        } catch (InputMismatchException LocationNotFound) {
            System.out.println("Invalid input. Enter only either 'Abington' or 'Bensalem'. Please try again. \n");
            return testLocation(getInput());
        }
    }

}
