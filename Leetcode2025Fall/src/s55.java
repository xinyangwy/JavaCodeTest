/**
 * @Auther: WuZilong
 * @Date: 2025/10/17 15:12
 * @Description:
 */
public class s55 {
    public boolean canJump(int[] nums) {
        int  maxPos=-1;
        for (int i = 0; i < nums.length; i++) {
            maxPos=Math.max(maxPos,i+nums[i]);
            if(maxPos>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
