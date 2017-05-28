import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/231/A
 * Created by yturi on 5/29/2017.
 */
public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> problems = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            problems.add(Arrays.asList(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        System.out.println(team(problems));
    }

    public static long team(List<List<Integer>> problems) {
        return problems.stream()
                .filter(problem -> problem.stream().mapToInt(i -> i).sum() >= 2)
                .count();
    }
}
