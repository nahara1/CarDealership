/*
Project: Car Dealership
Purpose Details: Creates transactions and uses setters and getters to calculate the price and commission for salesperson. Prints all transactions.
Course: IST 242 - 001
Team: 2
Author: Jeff Bezak
Date Developed: 2/15/2019
Last Date Changed: 4/30/2019
Rev: 1
*/ 

package edu.psu.ist.ab.ist242.team2;


import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Enumeration that contains the preset values of credit and cash to set payment type
 */
enum PaymentType {credit, cash}

public class Transaction {

    private double commission;
    private int transactionId;
    private PaymentType payment;
    private double subTotal;
    private double totalPrice;
    private double tax = 1.06;
    public String commissionID;
    public final double salary = 1500.00;

    // Transaction ID

    /**
     * Transaction Id getter
     * @return transaction id
     */

    public int getTransactionId() { return transactionId; }

    /**
     * Transaction Id getter
     * @param _transactionId transaction id
     */

    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    // Commission

    /**
     * Commisssion Id getter
     * @return
     */

    public double getCommission() { return commission; }

    public void setCommission(double _Commission) {this.commission = _Commission;}

    public String getCommissionID() { return Salesperson.empID; }

    public void setCommissionID(String commissionID) {Salesperson.empID = commissionID;}

    // Price

    public double getSubTotal() { return subTotal; }

    public void setSubTotal(double _subTotal) {this.subTotal = _subTotal;}

    public double getTotalPrice() { return totalPrice; }

    public void setTotalPrice(double _totalPrice) {this.totalPrice = _totalPrice;}

    // Payment Type

    public PaymentType getPaymentType() { return payment; }

    public void setPaymentType(PaymentType _pType) { payment = _pType; }

    public PaymentType setPaymentType() {
        System.out.println("Enter payment type: cash or credit");
        String _payment = Exception.testAlpha(Exception.getInput());
        payment = PaymentType.valueOf(_payment.toLowerCase());
        return payment;
    }

    // Transaction

    public Transaction() {}

    /**
     * calculateTransaction multiplies subtotal and tax, then rounds
     * @param transactionSubtotal subTotal
     * @param tax flat rate 6%
     * @return totalPrice
     * @author Jeff Bezak
     */
// junit
    public double calculateTransaction(double transactionSubtotal, double tax) {
        totalPrice = transactionSubtotal * tax;
        totalPrice = Math.round(totalPrice*100.0)/100.0;
        return totalPrice;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.00");

    /**
     * addTransaction will add a new transaction to the array list of transactions
     * @return transaction
     * @author Jeff Bezak
     */

    public Transaction addTransaction() {
        Transaction tran = new Transaction();

        System.out.println("Enter transaction ID");
        String _transactionId = Exception.testInt(Exception.getInput());
        transactionId = Integer.parseInt(_transactionId);
        tran.setTransactionId(transactionId);

        System.out.println("Enter subtotal as a double");
        String _subTotal = Exception.testDouble(Exception.getInput());
        subTotal = Double.parseDouble(_subTotal);
        tran.setSubTotal(subTotal);

        tran.setPaymentType();

        tran.setTotalPrice(calculateTransaction(tran.getSubTotal(), tax));
        System.out.println("Total price is: $" + getTotalPrice());

        tran.setCommission(tran.getSubTotal());
        System.out.println("Salesperson earned $" + df2.format(tran.getCommission()) + " commission");

        System.out.println("Enter Employee ID");
        Salesperson.empID = Exception.testAlphaNumeric(Exception.getInput());
        tran.setSalesCommission(getTotalPrice());
        tran.setCommissionID(Salesperson.empID);

        System.out.println("Transaction recorded");


        return tran;
    }

    /**
     * listTransactions will print list of previous transactions
     * @param transList Transaction array list
     * @author Jeff Bezak
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

    // commission method

    /**
     * setSalesCommission sets salesperson commission
     * @param _value a double
     * @return commission
     * @author JiaJia & Narrara
     */

    public double setSalesCommission(double _value) {
        return _value*0.15;
    }

    /**
     * setSalesCommission will print specific employee's commission based of given employee's ID
     * @param transactionArrayList Transaction array list
     * @param _empID               Employee's ID
     * @author Narrara & JiaJia
     */

    public static void printSalesCommission(ArrayList<Transaction> transactionArrayList, String _empID) {
        for (Transaction t1 : transactionArrayList) {
            if (t1.getCommissionID().equals(_empID)) {
                System.out.println("Commission: " + t1.getCommission());
            }
        }
    }



    public Transaction addCommission(double _sales) {
        Transaction commission = new Transaction();


        return commission;
    }

}
