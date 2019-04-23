package com.company;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

enum PaymentType {credit, cash,}

public class Transaction {

    private float commission, salary;
    int transactionId;
    PaymentType payment;
    private double subTotal;
    private double totalPrice;
    private double tax = 1.06;


    // Transaction ID

    public int getTransactionId() { return transactionId; }

    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

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

    // Price

    public double getSubTotal() { return subTotal; }

    public void setSubTotal(double _subTotal) {this.subTotal = _subTotal;}

    public double getTotalPrice() { return totalPrice; }

    public void setTotalPrice(double _totalPrice) {this.totalPrice = _totalPrice;}

    // Payment Type

    public PaymentType getPaymentType() { return payment; }

    public void setPaymentType(PaymentType _pType) { payment = _pType; }

    public PaymentType setPaymentType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter payment type: cash or credit");
        payment = PaymentType.valueOf(input.next().toLowerCase());
        return payment;
    }

    // Purchase

    public Transaction() {}

    public Transaction(int _transactionId, PaymentType _pType, double _subTotal){
        this.transactionId = _transactionId;
        this.payment = _pType;
        this.subTotal = _subTotal;
    }

    private double calculateTransaction(double transactionSubtotal, double tax) {
        totalPrice = transactionSubtotal * tax;
        totalPrice = Math.round(totalPrice*100.0)/100.0;
        return totalPrice;
    }


    public Transaction addTransaction() {
        System.out.println("Enter transaction ID, subtotal");
        Transaction tran = new Transaction();
        Scanner scnr = new Scanner(System.in);
        tran.setTransactionId(scnr.nextInt());
        tran.setSubTotal(scnr.nextDouble());
        tran.setPaymentType();
        tran.setTotalPrice(calculateTransaction(tran.getSubTotal(), tax));
        System.out.println("Total price is: $" + getTotalPrice());
        System.out.println("Transaction recorded");
        System.out.println();
        return tran;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.00");

    public static void listTransactions(ArrayList<Transaction> transList) {
        System.out.println("Transaction History:");
        System.out.println();
        for (Transaction tran : transList) {
            System.out.println("Transaction ID: " + tran.getTransactionId());
            System.out.println("Subtotal: $" + df2.format(tran.getSubTotal()));
            System.out.println("Total price: $" + df2.format(tran.getTotalPrice()));
            System.out.println("Payment type: " + tran.getPaymentType());
            System.out.println();
        }
    }
}
