import java.util.Scanner;

/**
 * Created by yturi on 5/29/2017.
 */
public class WordCapitalization {

    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        System.out.println(wordCapitalization(word));
    }

    public static String wordCapitalization(String word) {
        if(word.length() == 0) {
            return word;
        }
        return word.substring(0,1).toUpperCase() + (word.length() > 1 ? word.substring(1) : "");
    }
}
