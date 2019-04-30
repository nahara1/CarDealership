/*
Project: Car Dealership
Purpose Details: Creates an object parts and adds parts to the parts array list.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/27/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;


import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

/**
 * <h1>Parts</h1>
 *<p>
 * The Parts program contains setters, getters, and methods that add, modify,
 * and remove auto parts.
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
     * Counter that initializes parts ID
     */
    int cCount = 00001;


    /**
     * Parts Constructor
     */

    public Parts() {

    }

    /**
     * Parts Constructor
     * @param _partsID
     */
    public Parts(int _partsID) {

    }

    /**
     * Parts Constructor
     * @param _partID
     * @param _partCategory
     * @param _name
     */

    public Parts(int _partID, PartsCategory _partCategory, String _name) {
        this.name = _name;
        this.partCategory = _partCategory;
        this.partID = _partID;

    }

    /**
     * addParts method adds parts to inventory
     * <p>
     *  The addParts method prompts user to enter
     *  a Parts name, category, and price to be stored
     *  in the inventory.
     * </p>
     *
     * @return parts object of the Parts class
     */

    public Parts addParts() {
        Parts parts = new Parts(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter part name: ");
        name = Exception.testAlpha(Exception.getInput());
        parts.setPartName(name);
        parts.setCategory();
        System.out.println("Please enter part price: ");
        price = Double.parseDouble(Exception.getInput());
        parts.setPrice(price);

        parts.setPartID(cCount);

        return parts;
    }

    /**
     * Parts ID getter
     * @return auto part ID
     */

    public int getPartID() {
        return partID;
    }

    /**
     * Parts ID setter
     * @param randomID auto part ID
     */

    public void setPartID(int randomID) {
        this.partID = randomID;
    }

    /**
     * Parts Category getter
     * @return auto part category
     */
    public PartsCategory getPartCategory() {
        return partCategory;
    }

    /*
        public void setPartCategory(String anyPartCategory) {
            this.partCategory = anyPartCategory;
        }
    */


    /**
     * Parts name getter
     * @return auto part name
     */
    public String getPartName() {
        return name;
    }

    /**
     * Parts name setter
     * @param anyName auto part name
     */

    public void setPartName(String anyName) {
        this.name = anyName;
    }


    /**
     * Parts price getter
     * @return auto part price
     */
    public double getPrice() { return price; }

    /**
     * Parts price setter
     * @param _price auto part price
     */

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
}











