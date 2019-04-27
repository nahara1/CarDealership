package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

/**
 * <h1>Parts</h1>
 *
 * The Parts program contains setters, getter, and methods that add, modify,
 * and remove auto parts items
 * <p>
 *
 */

 public class Parts {


    private int partID;
    private String name;
    private PartsCategory partCategory;
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
     *
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

        // add part price

        parts.setPartID(cCount);

        return parts;
    }

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
    public static void sellParts(ArrayList<Parts> partsList, int _partID) {
        for (Parts parts : partsList) {
            if (parts.getPartID() == _partID) {
                partsList.remove(parts);
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

}











