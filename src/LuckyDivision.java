import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/122/A
 * Created by yturi on 6/7/2017.
 */
public class LuckyDivision {

    private List<Integer> luckyNumbers;

    private String getStartingString(int minLength) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < minLength; i++) {
            str.append("4");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println(isNearlyLuckyNumber(number) ? "YES" : "NO");
    }

    public static boolean isNearlyLuckyNumber(int number) {
        List<Integer> numbers = Arrays.asList(4,7, 44,47,74,77,444,447,474,477,744,747,774,777);
        if (numbers.contains(number)) {
            return true;
        }
        for (Integer n : numbers) {
            if(number % n == 0) {
                return true;
            }
        }
        return false;
    }
}
