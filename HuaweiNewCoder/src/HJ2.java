import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c=sc.next().charAt(0);
        int cnt=0;
        if(Character.isLetter(c)){
            char lowerC=Character.toLowerCase(c);
            for (char ch : str.toCharArray()) {
                if(Character.toLowerCase(ch)==lowerC){
                    cnt++;
                }
            }
        }else {
            for (char ch : str.toCharArray()) {
                if(ch==c){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}