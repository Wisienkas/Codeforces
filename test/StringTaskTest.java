import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class StringTaskTest {

    @Test
    public void test1() {
        String input = "Codeforces";
        String expect = ".c.d.f.r.c.s";
        Assert.assertEquals(expect, StringTask.stringTask(input));
    }

    @Test
    public void test2() {
        String input = "tour";
        String expect = ".t.r";
        Assert.assertEquals(expect, StringTask.stringTask(input));
    }

    @Test
    public void test3() {
        String input = "aBAcAba";
        String expect = ".b.c.b";
        Assert.assertEquals(expect, StringTask.stringTask(input));
    }
}
