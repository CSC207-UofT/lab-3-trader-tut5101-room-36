/*
 * This file contains sample JUnit test cases for Cat.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CatTest {
    Cat kitty;

    @Before
    public void setUp() throws Exception {
        kitty = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meow", kitty.sound());
    }

    @Test(timeout = 50)
    public void TestGetAge() {
        assertEquals(1, kitty.getAge());
    }

    @Test(timeout = 50)
    public void TestIsKitten() {
        assertEquals(true, kitty.isKitten());
    }

    @Test(timeout = 50)
    public void TestAddAge() {
        kitty.addAge();
        assertEquals(2, kitty.getAge());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        kitty.subtractAge();
        assertEquals(0, kitty.getAge());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, kitty.getPrice());
    }

}