package com.company;


import java.util.Scanner;

public class Parts {


    private int partID;
    private String name;
    private PartsCategory partCategory;




    // constructors

    public Parts () {

    }

    public Parts (int _partID, PartsCategory _partCategory, String _name) {
        this.name = _name;
        this.partCategory = _partCategory;
        this.partID = _partID;

    }

    public Parts addParts() {
        Parts parts = new Parts();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter part name: ");
        parts.setPartName(scnr.nextLine());
        parts.setCategory();
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
        System.out.println("Enter Parts Type: ");
        partCategory = PartsCategory.valueOf(input.next().toLowerCase());
        // add if statement for cash payment to calculate change
        return partCategory;
    }
}











