import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yturi on 5/29/2017.
 */
public class TwinsTest {

    @Test
    public void test1() {
        List<Integer> input = Arrays.asList(3, 3);
        int expected = 2;
        Assert.assertEquals(expected, Twins.twins(input));
    }

    @Test
    public void test2() {
        List<Integer> input = Arrays.asList(2,1,2);
        int expected = 2;
        Assert.assertEquals(expected, Twins.twins(input));
    }
}
