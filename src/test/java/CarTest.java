/*
 * This file contains sample JUnit test cases for Car.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(11, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(9, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, c.getPrice());
    }

}