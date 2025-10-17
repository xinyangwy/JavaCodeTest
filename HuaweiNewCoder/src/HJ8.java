import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Scanner;

public class HJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n!=0){
            map.merge(sc.nextInt(), sc.nextInt(), Integer::sum);
            n--;
        }
        for (Integer i : map.keySet()) {
            System.out.println(i+" "+map.get(i));
        }
    }
}
