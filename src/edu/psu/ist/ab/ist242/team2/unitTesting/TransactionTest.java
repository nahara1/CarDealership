package edu.psu.ist.ab.ist242.team2.unitTesting;

import edu.psu.ist.ab.ist242.team2.MainTest;

import edu.psu.ist.ab.ist242.team2.Transaction;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest extends MainTest {

    @Test
    public void totalPayment_UnitTestTrue() {
        Transaction trans = new Transaction();
        try {
            assertTrue(trans.calculateTransaction(5.0, 5.0) == 25.00);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Test
    public void totalPayment_additionUnitTestFalse () {
        Transaction trans = new Transaction();
        try {
            assertFalse(trans.calculateTransaction(5.0, 5.0) == 7.0);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }


}
