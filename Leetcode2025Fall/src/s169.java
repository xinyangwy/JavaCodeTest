/**
 * @Auther: WuZilong
 * @Date: 2025/10/15 14:34
 * @Description:
 */
public class s169 {
    public int majorityElement(int[] nums) {
        int[] count=new int[50000];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>nums.length/2){
                return i;
            }
        }
        return 0;
    }
}
