import java.util.Locale;
import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f=sc.nextFloat();
        int res=(int)f;
        float d=f-res;
        if(d>=0.5){
            System.out.println(res+1);
        }else{
            System.out.println(res);
        }
    }
}
