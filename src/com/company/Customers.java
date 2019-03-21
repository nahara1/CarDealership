package com.company;

public class Customers {

    public static void main(String[] args) {
    }

    private int custID;
    private String firstName, lastName, phoneNumber, custEmail, groupID;

    //Group customers based on their last name (asd order).
    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String _GroupID) {
        this.groupID = _GroupID;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int _CustID) {
        this.custID = _CustID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String _FirstName){
        this.firstName = _FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String _LastName){
        this.lastName = _LastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String _PhoneNumber){
        this.phoneNumber = _PhoneNumber;
    }

    public String getcustEmail() {
        return custEmail;
    }

    public void setCustEmail(String _email){
        this.custEmail = _email;
    }


    // purchaseCar
}
