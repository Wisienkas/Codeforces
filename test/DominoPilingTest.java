import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class DominoPilingTest {
    @Test
    public void test1() {
        Assert.assertEquals(4, DominoPiling.dominoPiling(2,4));
    }

    @Test
    public void test2() {
        Assert.assertEquals(4, DominoPiling.dominoPiling(3,3));
    }
}
