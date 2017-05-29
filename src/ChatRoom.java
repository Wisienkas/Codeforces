import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/58/A
 * Created by yturi on 5/29/2017.
 */
public class ChatRoom {
    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        System.out.println(chatRoom(word));
    }

    public static String chatRoom(String word) {
        word = word.toLowerCase();
        int h = word.indexOf('h');
        int e = word.indexOf('e', h + 1);
        int l1 = word.indexOf('l', e + 1);
        int l2 = word.indexOf('l', l1 + 1);
        int o = word.indexOf('o', l2 + 1);
        return h>-1 && e>-1 && l1>-1 && l2>-1 && o>-1 ? "YES" : "NO";
    }
}
