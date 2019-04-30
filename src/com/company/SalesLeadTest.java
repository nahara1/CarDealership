package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

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