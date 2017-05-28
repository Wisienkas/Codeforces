import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/96/A
 * Created by yturi on 5/29/2017.
 */
public class Football {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(football(line));
    }

    public static String football(String line) {
        return line.contains("0000000") || line.contains("1111111") ? "YES" : "NO";
    }
}
