import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class MyTest {
    @Test
    public void testSomething() {
        int expected = 10;
        int actual = 5 + 5;

        Assert.assertEquals(expected, actual);
    }
}