import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/158/B
 * Created by yturi on 5/29/2017.
 */
public class Taxi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println(taxi(numbers));
    }

    public static long taxi(List<Integer> numbers) {
        Map<Integer, Long> segments = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        segments.putIfAbsent(1, 0L);
        segments.putIfAbsent(2, 0L);
        segments.putIfAbsent(3, 0L);
        segments.putIfAbsent(4, 0L);
        long taxis = segments.get(4);
        // pair all 3's with 1's
        long threes = segments.get(3);
        long ones = segments.get(1);
        long reducing = Math.min(threes, ones);
        taxis += reducing;
        segments.put(3, segments.get(3) - reducing);
        segments.put(1, segments.get(1) - reducing);
        // pair 2's
        reducing = segments.get(2) / 2;
        segments.put(2, segments.get(2) % 2);
        taxis += reducing;
        // pair 1 and 2
        long twos = segments.get(2);
        ones = segments.get(1);
        reducing = Math.min(twos, ones / 2 + ones % 2);
        taxis += reducing;
        segments.put(2, segments.get(2) - reducing);
        segments.put(1, (segments.get(1) - reducing * 2));
        // Combining remaining ones
        ones = segments.get(1);
        reducing = ones / 4 + (ones % 4 > 0 ? 1 : 0);
        taxis += reducing;
        // Adding remaining 2's and 3's
        taxis += segments.get(2);
        taxis += segments.get(3);

        return taxis;
    }
}
