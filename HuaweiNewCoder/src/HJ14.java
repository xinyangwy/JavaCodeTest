import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        while(n!=0){
            arr.add(sc.next());
            n--;
        }
        Collections.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
