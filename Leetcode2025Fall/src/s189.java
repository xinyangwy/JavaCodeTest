import java.util.Arrays;

/**
 * @Auther: WuZilong
 * @Date: 2025/10/15 14:43
 * @Description:
 */
public class s189 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    private void reverse(int []nums,int begin,int  end){
        while (begin<end){
            int tmp=nums[begin];
            nums[begin]=nums[end];
            nums[end]=tmp;

            begin++;
            end--;
        }
    }
}
