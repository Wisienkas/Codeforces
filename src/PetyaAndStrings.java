import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/112/A
 * Created by yturi on 5/29/2017.
 */
public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(petyaAndStrings(a, b));
    }

    public static int petyaAndStrings(String a, String b) {
        int len = a.length();

        int diff =  a.compareToIgnoreCase(b);
        if (diff > 0)
            return 1;
        if (diff < 0)
            return -1;
        return 0;
    }
}
