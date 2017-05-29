import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/160/A
 * Created by yturi on 5/29/2017.
 */
public class Twins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            coins.add(scanner.nextInt());
        }
        System.out.println(twins(coins));
    }

    public static int twins(List<Integer> coins) {
        int totalSum = coins.stream().mapToInt(i -> i).sum();
        int partSum = 0;
        int coinCount = 0;
        Comparator<Integer> comp = (a, b) -> b - a;
        for (Integer i : coins.stream().sorted(comp).collect(Collectors.toList())) {
            partSum += i;
            coinCount++;
            if (partSum > totalSum / 2)
                break;
        }
        return coinCount;
    }
}
