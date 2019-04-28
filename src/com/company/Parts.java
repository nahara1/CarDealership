package com.company;


import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

/**
 * <h1>Parts</h1>
 *<p>
 * The Parts program contains setters, getters, and methods that add, modify,
 * and remove auto parts items
 *</p>
 *
 */

 public class Parts {

    /**
     * Auto part unique identification number
     */
    private int partID;

    /**
     * Auto part name
     */
    private String name;

    /**
     * Auto part price
     */
    private double price;

    /**
     * Auto part category
     */
    private PartsCategory partCategory;

    /**
     * counter that initializes parts id
     */
    int cCount = 00001;


    // constructors

    public Parts() {

    }

    public Parts(int _partsID) {

    }

    public Parts(int _partID, PartsCategory _partCategory, String _name) {
        this.name = _name;
        this.partCategory = _partCategory;
        this.partID = _partID;

    }

    /**
     * addParts method adds parts to inventory
     * <p>
     *  The addParts method prompts user to enter
     *  parts name, category and price to be stored
     *  in the inventory.
     * </p>
     *
     * @return parts object of the Parts class
     */

    public Parts addParts() {
        Parts parts = new Parts(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter part name: ");
        name = testAlpha(getInput());
        parts.setPartName(name);

        parts.setCategory();

        System.out.println("Please enter part name: ");
        price = Double.parseDouble(getInput());
        parts.setPrice(price);

        parts.setPartID(cCount);

        return parts;
    }


    // setters and getters

    public int getPartID() {
        return partID;
    }

    public void setPartID(int randomID) {
        this.partID = randomID;
    }

    public PartsCategory getPartCategory() {
        return partCategory;
    }

    /*
        public void setPartCategory(String anyPartCategory) {
            this.partCategory = anyPartCategory;
        }
    */
    public String getPartName() {
        return name;
    }

    public void setPartName(String anyName) {
        this.name = anyName;
    }

    public double getPrice() { return price; }

    public void setPrice(double _price) { this.price = _price; }


    /**
     * setCategory method sets category type for an auto part
     *
     * <p>
     * This method asks user to enter a category type predetermined by the
     * PartsCategory enum
     * </p>
     *
     * @return part Category
     */

    public PartsCategory setCategory() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Parts Type ('electronic', 'engine', 'interior', 'exterior', 'control'): ");
        partCategory = PartsCategory.valueOf(input.next().toLowerCase());
        return partCategory;
    }

    /**
     * printParts method prints dealership parts inventory
     * @param PartsArrayList Parts array list
     */

    public static void printParts(ArrayList<Parts> PartsArrayList) {
        for (Parts parts : PartsArrayList) {
            System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-12s\n", parts.getPartName());

        }
    }
/*
    public static void sellParts(ArrayList<Parts> partsList, String _partName) {
        for (Parts parts : partsList) {
            if (parts.getPartName().equals(_partName)) {
                partsList.remove(parts);
            }
        }
    }
*/

    /**
     *
     * sellParts method removes an auto part item from the parts array list
     * @param partsList parts Array List
     * @param _partID parts id
     *
     */
    public static void sellParts(ArrayList<Parts> partsList, int _partID) {

        try {

            for (Parts parts : partsList) {
                if (parts.getPartID() == _partID) {
                    partsList.remove(parts);
                }
            }
        }
        catch (ConcurrentModificationException e) {
            System.out.println("Invalid input. Make sure you entered the correct ID number.");
            sellParts(partsList, _partID);
        }
    }


    /**
     * getInput method prompts user for an input
     *
     * <p>
     *  This method is used inside the addParts method to
     *  ask for an auto part information and then through setters
     *  add that information into the Parts array list.
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

}











