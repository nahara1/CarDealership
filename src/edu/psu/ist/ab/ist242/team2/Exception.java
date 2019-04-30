package edu.psu.ist.ab.ist242.team2;

import java.util.InputMismatchException;
import java.util.Scanner;

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
            return getInput();

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
            return getInput();
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
