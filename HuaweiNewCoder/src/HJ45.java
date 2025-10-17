import java.util.Arrays;
import java.util.Scanner;

public class HJ45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        //nextInt不消耗换行符
        while (n!=0){
            String str=sc.next();
            int []cnt=new int[26];
            for (char c : str.toCharArray()) {
                cnt[c-'a']++;
            }
            Arrays.sort(cnt);
            int beauty=0,num=26;
            for (int i = cnt.length-1; i >=0; i--) {
                beauty+=cnt[i]*num;
                num--;
            }
            System.out.println(beauty);
            n--;
        }
    }
}
