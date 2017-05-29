import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class HelpfulMathTest {

    @Test
    public void test1() {
        String input = "3+2+1";
        String output = "1+2+3";
        Assert.assertEquals(output, HelpfulMath.helpfulMath(input));
    }

    @Test
    public void test2() {
        String input = "1+1+3+1+3";
        String output = "1+1+1+3+3";
        Assert.assertEquals(output, HelpfulMath.helpfulMath(input));
    }

    @Test
    public void test3() {
        String input = "2";
        String output = "2";
        Assert.assertEquals(output, HelpfulMath.helpfulMath(input));
    }

}
