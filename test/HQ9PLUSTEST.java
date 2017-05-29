import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class HQ9PLUSTEST {

    @Test
    public void test1() {
        String input = "Hi!";
        String expected = "YES";
        Assert.assertEquals(expected, HQ9PLUS.hq9plus(input));
    }

    @Test
    public void test2() {
        String input = "Codeforces";
        String expected = "NO";
        Assert.assertEquals(expected, HQ9PLUS.hq9plus(input));
    }

}
