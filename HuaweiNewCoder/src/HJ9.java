import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class HJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer num = new StringBuffer(str);
        StringBuffer res=num.reverse();
        HashSet<Character> set = new HashSet<>();
        for (char c : res.toString().toCharArray()) {
            if(set.add(c)){
                System.out.print(c);
            }
        }
    }
}