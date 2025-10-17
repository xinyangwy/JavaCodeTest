import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HJ41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []weights=new int[n];
        int []nums=new int[n];
        for (int i = 0; i < n; i++) {
            weights[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        //一种一种往上加

        set.add(0);//set.add(0)的作用是初始化一个 “零重量” 的状态， 初始化 list.size()为1，使k 循环
        for (int i = 0; i < n; i++) {//哪一种砝码
            ArrayList<Integer> list = new ArrayList<>(set);
            for (int j = 1; j <=nums[i]; j++) {// 第i种砝码加几个   总计nums[i]  个
                //在原来基础上 加入set
                for (int k = 0; k < list.size(); k++) {
                    set.add(list.get(k)+weights[i]*j);
                }
            }
        }
        System.out.println(set.size());
    }
}
