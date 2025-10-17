import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String numStr=str.substring(2);
        int n=numStr.length()-1;
        int  res=0;
        for (int i = 0; i <=n ; i++) {
            char ch=numStr.charAt(i);
            if(Character.isLetter(ch)){
                res+=(ch-'A'+10)*Math.pow(16,n-i);
            }else{
                res+=(ch-'0')*Math.pow(16,n-i);
            }
        }
        System.out.println(res);
    }
}
