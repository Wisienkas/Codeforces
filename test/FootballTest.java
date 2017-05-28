import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class FootballTest {

    @Test
    public void test1() {
        String input = "001001";
        String expect = "NO";
        Assert.assertEquals(expect, Football.football(input));
    }

    @Test
    public void test2() {
        String input = "1000000001";
        String expect = "YES";
        Assert.assertEquals(expect, Football.football(input));
    }
}
