import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class PetyaAndStringsTest {

    @Test
    public void test1() {
        String a = "aaaa";
        String b = "aaaA";
        int expect = 0;
        Assert.assertEquals(expect, PetyaAndStrings.petyaAndStrings(a ,b));
    }

    @Test
    public void test2() {
        String a = "abs";
        String b = "Abz";
        int expect = -1;
        Assert.assertEquals(expect, PetyaAndStrings.petyaAndStrings(a ,b));
    }

    @Test
    public void test3() {
        String a = "abcdefg";
        String b = "AbCdEfF";
        int expect = 1;
        Assert.assertEquals(expect, PetyaAndStrings.petyaAndStrings(a ,b));
    }
}
