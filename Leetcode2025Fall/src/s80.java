/**
 * @Auther: WuZilong
 * @Date: 2025/10/15 14:16
 * @Description:
 */
public class s80 {
    public int removeDuplicates(int[] nums) {
        int  stackSize=2;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i]!=nums[stackSize-2]){
                nums[stackSize++]=nums[i];
            }
        }
        return stackSize;
    }
}
