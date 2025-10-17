import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String []strnums=line.split(",");
        int nums[]=new int[strnums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Integer.parseInt(strnums[i]);
        }
        List<List<Integer>> res=splitIntoDecreasingSubsequences();

    }

    public static List<List<Integer>> splitIntoDecreasingSubsequences(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        for (int num : nums) {
            boolean isadded= false;
            for (List<Integer> list : res) {
                if(num<list.get(list.size()-1)){
                    list.add(num);
                    isadded=true;
                    break;
                }
            }
            if(!isadded){
                List<Integer> tmp=new ArrayList<>();
                tmp.add(num);
                res.add(tmp);
            }
        }
        return res;
    }
}