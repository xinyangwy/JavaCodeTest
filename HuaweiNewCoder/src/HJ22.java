import java.util.Scanner;

public class HJ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                break;
            }else{
                System.out.println(getNum(n));
            }
        }
    }

    private static int getNum(int n) {
        int res=0;
        while(n>=3){
            res+=n/3;
            n=n/3+n%3;
        }
        if(n==2){
            res++;
        }
        return res;
    }
}
