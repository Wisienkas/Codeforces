import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yturi on 5/29/2017.
 */
public class BitPlusPlusTest {

    @Test
    public void test1() {
        List<String> input = Arrays.asList(
                "++X"
        );
        int expect = 1;
        Assert.assertEquals(expect, BitPlusPlus.bitPlusPlus(input));
    }

    @Test
    public void test2() {
        List<String> input = Arrays.asList(
                "X++",
                "--X"
        );
        int expect = 0;
        Assert.assertEquals(expect, BitPlusPlus.bitPlusPlus(input));
    }

    @Test
    public void test3() {
        List<String> input = Arrays.asList(
                "++X",
                "++X",
                "++X"
        );
        int expect = 3;
        Assert.assertEquals(expect, BitPlusPlus.bitPlusPlus(input));
    }

    @Test
    public void test4() {
        List<String> input = Arrays.asList(
                "--X",
                "--X"
        );
        int expect = -2;
        Assert.assertEquals(expect, BitPlusPlus.bitPlusPlus(input));
    }
}
