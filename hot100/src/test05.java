import java.sql.ClientInfoStatus;
import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Solution05 s = new Solution05();
        List<List<Integer>> ans = s.threeSum(nums);
        for (List<Integer> an : ans) {
            for (Integer i : an) {
                System.out.print(i + " ");
            }
        }

    }
}


class Solution05 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        for (int i = 0; i < len - 2; i++) {
            if (nums[i] >= 0) {
                return new ArrayList<>();
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = len - 1;
            int sum = nums[i] + nums[l] + nums[r];
            while (l < r) {
                if (sum == 0) {
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }

        }
        return res;
    }
}