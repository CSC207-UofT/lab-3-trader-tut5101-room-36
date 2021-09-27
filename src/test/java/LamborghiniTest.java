

import org.junit.*;

import static org.junit.Assert.*;

public class LamborghiniTest {
    Lamborghini h;

    @Before
    public void setUp() throws Exception {
        h = new Lamborghini();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woonnnnn!", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(101, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(99, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, h.getPrice());
    }

}
