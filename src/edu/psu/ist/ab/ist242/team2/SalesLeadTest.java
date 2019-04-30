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