import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/71/A
 * Created by yturi on 5/28/2017.
 */
public class WayTooLongWords {

    public static void main(String[] args) {
        WayTooLongWords(new Scanner(System.in));
    }

    /**
     * http://codeforces.com/problemset/problem/71/A
     * @param scan
     */
    private static void WayTooLongWords(Scanner scan) {
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i++) {
            String result = WayTooLongWord(scan.nextLine());
            System.out.println(result);
        }
    }


    public static String WayTooLongWord(String word) {
        if (word.length() <= 10) {
            return word;
        }
        return word.substring(0,1) + Integer.toString(word.length() - 2) + word.substring(word.length() - 1, word.length());
    }
}
