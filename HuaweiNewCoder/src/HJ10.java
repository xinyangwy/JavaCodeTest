import java.util.HashSet;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line  =sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (char c : line.toCharArray()) {
            set.add(c);
        }
        System.out.println(set.size());
    }
}

