package com.company;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class MainTest {


    @org.junit.Test
    public void getActionTestTrue() {
        assertTrue(Main.getAction("1"));

    }

    private void assertTrue(char action) {
    }

    @org.junit.Test
    public void getActionTestFalse() {
        assertFalse(Main.getAction(""));
    }

    private void assertFalse(char action) {
    }


}
