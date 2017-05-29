import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class WordCapitalizationTest {

    @Test
    public void test1() {
        String input = "ApPLe";
        String expected = "ApPLe";
        Assert.assertEquals(expected, WordCapitalization.wordCapitalization(input));
    }

    @Test
    public void test2() {
        String input = "konjac";
        String expected = "Konjac";
        Assert.assertEquals(expected, WordCapitalization.wordCapitalization(input));
    }

}
