import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/339/A
 * Created by yturi on 5/29/2017.
 */
public class HelpfulMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(helpfulMath(line));
    }

    public static String helpfulMath(String line) {
        List<String> numbers = Arrays.asList(line.split("\\+"));
        return numbers.stream()
                .mapToInt(Integer::parseInt)
                .sorted()
                .boxed()
                .map(n -> n.toString())
                .collect(Collectors.joining("+"));
    }
}
