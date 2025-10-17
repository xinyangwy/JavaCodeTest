/**
 * @Auther: WuZilong
 * @Date: 2025/10/13 12:14
 * @Description:
 */
public class s27 {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            int j=i;
            while(nums[j]==val){
                j++;
            }
            if(j== nums.length){
                break;//如果最后一个数字是val直接退出
            }
            i=j;
            nums[index++]=nums[i];
        }
        return index+1;
    }
}
