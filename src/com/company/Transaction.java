package com.company;

public class Transaction {

    private float commission, salary;


    // Salary
    public float getSalary() {
        return commission;
    }

    public void setSalary(float _Salary) {this.commission = _Salary;}


    // Commission

    public float getCommission() {
        return commission;
    }

    public void setCommission(float _Commission) {this.commission = _Commission;}

    public void commission(int inventoryID, float price, int empID) {
        commission = price*0.1f;
    }


    // Purchase





}
