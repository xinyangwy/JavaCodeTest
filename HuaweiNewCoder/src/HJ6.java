import java.util.Scanner;

public class HJ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long k=(long)Math.sqrt(num);
        for(long i=2;i<=k;i++){
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }
        System.out.println();
    }
}
