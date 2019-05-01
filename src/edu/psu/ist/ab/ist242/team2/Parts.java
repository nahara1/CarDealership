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

import java.util.Scanner;

import java.util.ArrayList;

/**
 * <h1>Parts</h1>
 *<p>
 * The Parts program contains setters, getters, and methods that add, modify,
 * and remove auto parts.
 *</p>
 * @author Narrara, JiaJia, Ronald
 *
 */

 public class Parts {


    /**
     * Auto part unique identification number
     */
    private int partID;

    /**
     * Auto part name, location
     */
    private String name, location;

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

        System.out.println("Please enter location: ");
        location = Exception.testAlpha(Exception.getInput());
        parts.setLocation(location);

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

    public void setLocation(String _location) {
        this.location = _location;
    }

    public String getLocation() {
        return location;
    }

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


    public void setCategory(PartsCategory _category) { this.partCategory = _category; }

    public PartsCategory getCategory() { return partCategory; }
    /**
     * setCategory method sets category type for an auto part
     *
     * <p>
     * This method asks user to enter a category type predetermined by the
     * PartsCategory enum
     * </p>
     *
     * @return part Category
     * @author Narrara
     */

    public PartsCategory setCategory() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Parts Type ('electronic', 'engine', 'interior', 'exterior', 'control'): ");
        partCategory = PartsCategory.valueOf(input.next().toLowerCase());
        return partCategory;
    }

    /**
     * printParts method prints all parts by their names
     * @param PartsArrayList parts Array List
     * @author JiaJia, Narrara
     */
    public static void printParts(ArrayList<Parts> PartsArrayList) {
        for (Parts parts : PartsArrayList) {
            System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-12s\n", parts.getPartName());

        }
    }

    /**
     * printPartsByCategory method prints parts that are of a specific category
     * @param partsList parts Array List
     * @param _category parts category
     * @author Jason
     */
    public static void printPartsByCategory(ArrayList<Parts> partsList, PartsCategory _category) {
        for (Parts parts : partsList) {
            if (parts.getPartName().equals(_category)) {
                System.out.printf("%-10s | %-10s \n", parts.getPartName(), parts.getPartCategory());
            }
        }
    }

    /**
     * printPartsByLocation method prints parts that are of a specific dealership
     * @param partsList parts Array List
     * @param _location parts location
     * @author JiaJia, Alex, Narrara
     */
    public static void printPartsByLocation(ArrayList<Parts> partsList, String _location) {
        for (Parts parts : partsList) {
            if (parts.location.equals(_location)) {
                System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s \n", parts.getPartID(), parts.getPartName(), parts.getPrice(), parts.getPartCategory(), parts.getLocation());
            }
        }
    }

    /**
     * sellParts removes parts item from array list
     * @param partsList  parts Array List
     * @param _partID parts identification number
     * @author Narrara
     */
    public static void sellParts(ArrayList<Parts> partsList, int _partID) {
        for (Parts parts : partsList) {
            if (parts.getPartID() == _partID) {
                partsList.remove(parts);
            }
        }
    }
}











