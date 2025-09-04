import Education.Education;
import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;

public class TestClass {
    private static Education main;

    @BeforeClass
    public static void setUp() {
        main = new Education();
    }

    @Test
    public void testPhd() {
        int result = main.getDegree("phd");
        Assert.assertEquals("Test completed: ", 9, result);
    }

    @Test
    public void testMsc() {
        int result = main.getDegree("msc");
        Assert.assertEquals("Test completed: ", 6, result);
    }

    @Test
    public void testBsc() {
        int result = main.getDegree("bsc");
        Assert.assertEquals("Test completed: ", 4, result);
    }
}
