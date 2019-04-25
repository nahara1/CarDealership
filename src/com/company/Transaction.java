package com.company;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

enum PaymentType {credit, cash,}

public class Transaction {

    private double commission;
    private int transactionId;
    private PaymentType payment;
    private double subTotal;
    private double totalPrice;
    private double tax = 1.06;

    // Transaction ID

    public int getTransactionId() { return transactionId; }

    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    // Commission

    public double getCommission() {
        return commission;
    }

    public void setCommission(double _Commission) {this.commission = _Commission * 0.1;}

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

    // Transaction

    public Transaction() {}

    /**
     * calculateTransaction multiplies subtotal and tax, then rounds
     * @param transactionSubtotal subTotal
     * @param tax flat rate 6%
     * @return totalPrice
     */

    private double calculateTransaction(double transactionSubtotal, double tax) {
        totalPrice = transactionSubtotal * tax;
        totalPrice = Math.round(totalPrice*100.0)/100.0;
        return totalPrice;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.00");

    /**
     * addTransaction will add a new transaction to the array list of transactions
     * @return transaction
     */

    public Transaction addTransaction() {
        System.out.println("Enter transaction ID");
        Transaction tran = new Transaction();
        Scanner scnr = new Scanner(System.in);

        while (!scnr.hasNextInt()) {
            scnr.next();
            System.out.println("Enter an integer");
        }
        tran.setTransactionId(scnr.nextInt());

        System.out.println("Enter subtotal");
        while (!scnr.hasNextInt()) {
            scnr.next();
            System.out.println("Enter a double");
        }
        tran.setSubTotal(scnr.nextDouble());

        tran.setPaymentType();

        tran.setTotalPrice(calculateTransaction(tran.getSubTotal(), tax));
        System.out.println("Total price is: $" + getTotalPrice());

        tran.setCommission(tran.getSubTotal());
        System.out.println("Salesperson earned $" + df2.format(tran.getCommission()) + " commission");

        System.out.println("Transaction recorded");
        return tran;
    }

    /**
     * listTransactions will print list of previous transactions
     * @param transList Transaction array list
     */

    public static void listTransactions(ArrayList<Transaction> transList) {
        System.out.println("Transaction History:");
        for (Transaction tran : transList) {
            System.out.println();
            System.out.println("Transaction ID: " + tran.getTransactionId());
            System.out.println("Subtotal: $" + df2.format(tran.getSubTotal()));
            System.out.println("Total price: $" + df2.format(tran.getTotalPrice()));
            System.out.println("Payment type: " + tran.getPaymentType());
            System.out.println("Commission from sale: $" + df2.format(tran.getCommission()));
        }
    }
}
