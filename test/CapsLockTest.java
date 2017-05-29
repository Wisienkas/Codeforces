import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class CapsLockTest {

    @Test
    public void test1() {
        String input = "cAPS";
        String expected = "Caps";
        Assert.assertEquals(expected, CapsLock.capsLock(input));
    }

    @Test
    public void test2() {
        String input = "Lock";
        String expected = "Lock";
        Assert.assertEquals(expected, CapsLock.capsLock(input));
    }

    @Test
    public void testMine1() {
        String input = "HTTP";
        String expected = "http";
        Assert.assertEquals(expected, CapsLock.capsLock(input));
    }

    @Test
    public void testMine2() {
        String input = "z";
        String expected = "Z";
        Assert.assertEquals(expected, CapsLock.capsLock(input));
    }

    @Test
    public void testMine3() {
        String input = "cHJSa";
        String expected = "cHJSa";
        Assert.assertEquals(expected, CapsLock.capsLock(input));
    }
}
