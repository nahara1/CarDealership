package com.company;

public class Parts {


    // Getters and Setters for Parts sub-class
    private int partID;
    private String partCategory, name;
    //



    // constructors

    public Parts () {

    }

    public Parts (int _partID, String _partCategory, String _name) {
        this.name = _name;
        this.partCategory = _partCategory;
        this.partID = _partID;

    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int randomID) {
        this.partID = randomID;
    }

    public String getPartCategory() {
        return partCategory;
    }

    public void setPartCategory(String anyPartCategory) {
        this.partCategory = anyPartCategory;
    }

    public String getPartName() {
        return name;
    }

    public void setPartName(String anyName) {
        this.name = anyName;
    }
}











