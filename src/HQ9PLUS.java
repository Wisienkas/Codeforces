import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * http://codeforces.com/problemset/problem/133/A
 * Created by yturi on 5/29/2017.
 */
public class HQ9PLUS {

    public static void main(String[] args) {
        String program = new Scanner(System.in).nextLine();
        System.out.println(hq9plus(program));
    }

    public static String hq9plus(String program) {
        final Set<Character> printInstructions = new HashSet<>(Arrays.asList('H', 'Q', '9'));
        return program.chars().mapToObj(c -> (char)c).anyMatch(printInstructions::contains) ? "YES" : "NO";
    }
}
