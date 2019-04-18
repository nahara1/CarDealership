package com.company;


enum PaymentType {credit, cash}

public class Transaction {

    private float commission, salary;
    int transactionId;
    PaymentType payment;


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

    public void commission(int inventoryID, float price) {
        commission = price*0.1f;
    }


    // Purchase


    public Transaction(int _transactionId, PaymentType _pType){
        this.transactionId = _transactionId;
        this.payment = _pType;
    }





}
