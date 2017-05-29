import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/131/A
 * Created by yturi on 5/29/2017.
 */
public class CapsLock {

    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        System.out.println(capsLock(word));
    }

    public static String capsLock(String word) {
        if(Character.isLowerCase(word.charAt(0))) {
            if(word.length() > 1) {
                if(word.substring(1).chars().mapToObj(c -> (char)c).allMatch(Character::isUpperCase)) {
                    return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
                } else {
                    return word;
                }
            } else {
                return word.toUpperCase();
            }
        } else if(word.chars().mapToObj(c -> (char)c).allMatch(Character::isUpperCase)) {
            return word.toLowerCase();
        }
        return word;
    }
}
