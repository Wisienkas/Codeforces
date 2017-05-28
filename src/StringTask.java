import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/118/A
 *
 * Created by yturi on 5/29/2017.
 */
public class StringTask {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(stringTask(line));
    }

    public static String stringTask(String line) {
        return line.toLowerCase()
                .replaceAll("[aoyeui]", "")
                .replaceAll("([a-z])", ".$1");
    }
}
