import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yturi on 5/29/2017.
 */
public class TramTest {

    @Test
    public void test1() {
        List<Tram.TramStop> input = Arrays.asList(
                new Tram.TramStop(0, 3),
                new Tram.TramStop(2, 5),
                new Tram.TramStop(4, 2),
                new Tram.TramStop(4, 0)
        );
        int expected = 6;
        Assert.assertEquals(expected, Tram.tram(input));
    }
}
