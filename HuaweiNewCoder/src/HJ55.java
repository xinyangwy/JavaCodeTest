import java.util.Scanner;

public class HJ55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for (int i = 1; i <= n; i++) {
            if(isAbout7(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean isAbout7(int x) {
        if(x%7==0){
            return true;
        }
        if(Integer.toString(x).contains("7")){
            return true;
        }
        return false;
    }
}
