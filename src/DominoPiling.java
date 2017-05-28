import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/50/A
 * Created by yturi on 5/29/2017.
 */
public class DominoPiling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(dominoPiling(m, n));
    }

    public static int dominoPiling(int m, int n) {
        int area = m * n;
        return area / 2;
    }
}
