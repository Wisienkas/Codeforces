import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yturi on 5/29/2017.
 */
public class TeamTest {

    @Test
    public void test1() {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 1, 0),
                Arrays.asList(1, 1, 1),
                Arrays.asList(1, 0, 0)
        );
        long expect = 2;
        Assert.assertEquals(expect, Team.team(input));
    }

    @Test
    public void test2() {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 0, 0),
                Arrays.asList(0, 1, 1)
        );
        long expect = 1;
        Assert.assertEquals(expect, Team.team(input));
    }
}
