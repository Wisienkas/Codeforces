import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/116/A
 * Created by yturi on 5/29/2017.
 */
public class Tram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<TramStop> stops = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stops.add(new TramStop(scanner.nextInt(), scanner.nextInt()));
        }
        System.out.println(tram(stops));
    }

    public static int tram(List<TramStop> stops) {
        int passengers = 0;
        int max = 0;
        for (TramStop stop : stops) {
            passengers += stop.enter - stop.exit;
            max = Math.max(max, passengers);
        }
        assert(passengers == 0);
        return max;
    }

    public static class TramStop {
        int exit;
        int enter;

        public TramStop(int exit, int enter) {
            this.exit = exit;
            this.enter = enter;
        }
    }
}
