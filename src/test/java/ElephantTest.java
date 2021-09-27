import org.junit.*;

import static org.junit.Assert.*;

public class ElephantTest {

    Elephant e;

    @Before
    public void setUp() throws Exception {
        e = new Elephant();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Trumpet and Rumble!", e.sound());
    }

}
