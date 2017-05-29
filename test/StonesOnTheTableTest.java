import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yturi on 5/29/2017.
 */
public class StonesOnTheTableTest {

    @Test
    public void test1() {
        List<Character> input = "RRG".chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        int expected = 1;
        Assert.assertEquals(expected, StonesOnTheTable.stonesOnTheTable(input));
    }

    @Test
    public void test2() {
        List<Character> input = "RRRRR".chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        int expected = 4;
        Assert.assertEquals(expected, StonesOnTheTable.stonesOnTheTable(input));
    }

    @Test
    public void test3() {
        List<Character> input = "BRBG".chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        int expected = 0;
        Assert.assertEquals(expected, StonesOnTheTable.stonesOnTheTable(input));
    }
}
