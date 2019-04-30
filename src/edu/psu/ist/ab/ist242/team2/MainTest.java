/*
Project: Car Dealership
Purpose Details: Tests the main method.
Course: IST 242 - 001
Team: 2
Date Developed: 2/15/2019
Last Date Changed: 4/29/2019
Rev: 1
*/

package edu.psu.ist.ab.ist242.team2;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class MainTest {


   @Test
    public void getActionTest() {
       try {
           assertEquals(Main.getAction("N"), 'N');
       } catch (Exception e) {
           System.out.println("Exception: " + e.getMessage());
       }
   }


   @Test
    public void getActionTestTrue() {
       try {
           Assert.assertEquals('N', 'N');
       }
       catch (Exception e) {
           System.out.println("Exception: " + e.getMessage());
       }
   }

    @Test
    public void getActionTestFalse() {
        try {
            Assert.assertNotEquals(Main.getAction("Naha"), 'N');
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }




}

