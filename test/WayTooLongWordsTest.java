import org.junit.Assert;
import org.junit.Test;

/**
 * http://codeforces.com/problemset/problem/71/A
 * Created by yturi on 5/27/2017.
 */
public class WayTooLongWordsTest {


    @Test
    public void testShortWord() {
        String expect = "word";
        Assert.assertEquals(expect, WayTooLongWords.WayTooLongWord(expect));
    }

    @Test
    public void testNoWord() {
        String expect = "";
        Assert.assertEquals(expect, WayTooLongWords.WayTooLongWord((expect)));
    }

    @Test
    public void testLimitWord() {
        String expect ="Hajfusksoe";
        Assert.assertEquals(expect, WayTooLongWords.WayTooLongWord(expect));
    }

    @Test
    public void testLongWord() {
        String input = "jasjdkcuucuajsdawek";
        String expect = "j17k";
        Assert.assertEquals(expect, WayTooLongWords.WayTooLongWord(input));
    }
}
