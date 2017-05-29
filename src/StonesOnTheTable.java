import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/266/A
 * Created by yturi on 5/29/2017.
 */
public class StonesOnTheTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Character> stoneColors = scanner.nextLine().chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        System.out.println(stonesOnTheTable(stoneColors));
    }

    public static int stonesOnTheTable(List<Character> stoneColors) {
        Character last = '\0';
        int neighboring = 0;
        for (Character c : stoneColors) {
            if (c.compareTo(last) == 0) {
                neighboring++;
            }
            last = c;
        }
        return neighboring;
    }
}
