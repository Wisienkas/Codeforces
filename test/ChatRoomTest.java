import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yturi on 5/29/2017.
 */
public class ChatRoomTest {

    @Test
    public void test1() {
        String input = "ahhellllloou";
        String expected = "YES";
        Assert.assertEquals(expected, ChatRoom.chatRoom(input));
    }

    @Test
    public void test2() {
        String input = "hlelo";
        String expected = "NO";
        Assert.assertEquals(expected, ChatRoom.chatRoom(input));
    }

    @Test
    public void test3() {
        String input = "helhcludoo";
        String expected = "YES";
        Assert.assertEquals(expected, ChatRoom.chatRoom(input));
    }



    @Test
    public void testMine1() {
        String input = "helo";
        String expected = "NO";
        Assert.assertEquals(expected, ChatRoom.chatRoom(input));
    }
}
