import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/282/A
 * Created by yturi on 5/29/2017.
 */
public class BitPlusPlus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> operations = new ArrayList<>();
        scanner.nextLine(); // to jump to next line, as nextInt() does not do that
        for (int i = 0; i < n; i++) {
            operations.add(scanner.nextLine());
        }
        System.out.println(bitPlusPlus(operations));
    }

    public static int bitPlusPlus(List<String> operations) {
        return operations.stream()
                .mapToInt(line -> line.charAt(1) == '+' ? 1 : -1)
                .sum();
    }
}
