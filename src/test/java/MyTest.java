import org.testng.annotations.Test;
import org.testng.Assert;

public class MyTest {
    @Test
    public void testSomething() {
        int expected = 14;
        int actual = 7 + 7;

        Assert.assertEquals(expected, actual);
    }
}