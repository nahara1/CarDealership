SalesLead Test
/*
Project: Car Dealership
Purpose Details: Tests sales lead class.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/29/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import org.junit.Test;

public class SalesLeadTest extends MainTest {


    @Test
    public void addSL() {
        try {
            SalesLead sl = new SalesLead();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


}