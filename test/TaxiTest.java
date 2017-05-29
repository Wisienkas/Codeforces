import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yturi on 5/29/2017.
 */
public class TaxiTest {

    @Test
    public void test1() {
        List<Integer> input = Arrays.asList(
                1,2,4,3,3
        );
        int expected = 4;
        Assert.assertEquals(expected, Taxi.taxi(input));
    }

    @Test
    public void test2() {
        List<Integer> input = Arrays.asList(
                2,3,4,4,2,1,3,1
        );
        int expected = 5;
        Assert.assertEquals(expected, Taxi.taxi(input));
    }

    @Test
    public void test5() {
        List<Integer> input = Arrays.asList(
                2, 1
        );
        int expected = 1;
        Assert.assertEquals(expected, Taxi.taxi(input));
    }

    @Test
    public void test8() {
        List<Integer> input = Arrays.asList(
                1
        );
        int expected = 1;
        Assert.assertEquals(expected, Taxi.taxi(input));
    }

    @Test
    public void test55() {
        List<Integer> input = Arrays.asList(
                3, 1, 2, 1, 1, 1, 1, 1, 1
        );
        int expected = 3;
        Assert.assertEquals(expected, Taxi.taxi(input));
    }
}
