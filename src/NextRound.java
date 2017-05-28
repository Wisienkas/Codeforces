import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * http://codeforces.com/problemset/problem/158/A
 * Created by yturi on 5/28/2017.
 */
public class NextRound {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> scores = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            scores.add(scanner.nextInt());
        }
        System.out.println(nextRound(scores, k));
    }

    private static long nextRound(List<Integer> scores, int k) {
        final int worst = scores.get(k - 1);
        return scores.stream()
                .filter(score -> score >= worst)
                .filter(score -> score > 0)
                .count();
    }
}
