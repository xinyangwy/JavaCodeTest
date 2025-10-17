import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=sc.next();
        Double p=Double.parseDouble(str);
        int m=sc.nextInt();
        int n=sc.nextInt();

        //C m n
        double sum1= 1.0,sum2=1.0;
        int k=n;
        for (int i = 0; i < k; i++) {
            sum1*=m;
            sum2*=n;
            m--;
            n--;
        }
//        System.out.println(sum1);
//        System.out.println(sum2);
        System.out.println(sum1/sum2);
//        System.out.println(Math.pow(0.25,17));
        System.out.printf("%1.2f",(sum1/sum2)*Math.pow(p,n)*Math.pow((1-p),(m-n)));
    }
}