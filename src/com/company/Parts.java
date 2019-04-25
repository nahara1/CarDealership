package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

public class Parts {


    private int partID;
    private String name;
    private PartsCategory partCategory;

    // constructors

    public Parts() {

    }

    public Parts(int _partID, PartsCategory _partCategory, String _name) {
        this.name = _name;
        this.partCategory = _partCategory;
        this.partID = _partID;

    }

    /**
     * addParts method adds parts to inventory               (1)
     * <p>
     * Longer description. If there were any, it would be    (2)
     * here.
     * </p>
     *
     * @return parts object of the Parts class
     */

    public Parts addParts() {
        Parts parts = new Parts();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter part name: ");


        try {
            setPartName(scnr.nextLine());
            parts.setCategory();
            return parts;

        } catch (InputMismatchException notAnAlpha) {

            System.out.println("Invalid input. You did not enter an alpha character. Please try again.\n");
        }

        // add part price

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

    public PartsCategory setCategory() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Parts Type ('electronic', 'engine', 'interior', 'exterior', 'control'): ");
        partCategory = PartsCategory.valueOf(input.next().toLowerCase());
        // add if statement for cash payment to calculate change
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
           //nt _partName = parts.getPartID();
            if (parts.getPartID() == _partID) {
                partsList.remove(parts);
            }
        }
    }

}











