import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        TheatreSquare(scan);
        watermelon(scan);
    }



    /**
     * http://codeforces.com/problemset/problem/1/A
     */
    public static void TheatreSquare(Scanner scanner) {
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        System.out.println((long)(Math.ceil((double)n / a) * Math.ceil((double)m / a)));
    }

    /**
     * http://codeforces.com/problemset/problem/4/A
     * @param scanner
     */
    public static void watermelon(Scanner scanner) {
        long w = scanner.nextLong();
        System.out.println(w > 3 & w % 2 == 0 ? "YES" : "NO");
    }

}
