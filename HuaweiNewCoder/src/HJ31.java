import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HJ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String []words= str.split("[^a-zA-Z]");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
