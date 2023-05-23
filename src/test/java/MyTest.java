import org.testng.annotations.Test;
import org.testng.Assert;

public class MyTest {
    @Test
    public void testSomething() {
        int expected = 12;
        int actual = 6 + 6;

        Assert.assertEquals(expected, actual);
    }
}