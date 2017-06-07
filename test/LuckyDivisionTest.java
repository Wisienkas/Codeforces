import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 6/7/2017.
 */
public class LuckyDivisionTest {

    @Test
    public void test1() {
        int input = 47;
        boolean expected = true;
        Assert.assertEquals(expected, LuckyDivision.isNearlyLuckyNumber(input));
    }
    @Test
    public void test2() {
        int input = 16;
        boolean expected = true;
        Assert.assertEquals(expected, LuckyDivision.isNearlyLuckyNumber(input));
    }
    @Test
    public void test3() {
        int input = 78;
        boolean expected = false;
        Assert.assertEquals(expected, LuckyDivision.isNearlyLuckyNumber(input));
    }
}
