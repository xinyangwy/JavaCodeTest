/**
 * @Auther: WuZilong
 * @Date: 2025/10/17 16:33
 * @Description:
 */
public class s45 {
    public int jump(int[] nums){
        int maxPos=0,curEnd=0,jump=0;
        int n= nums.length;
        for (int i = 0; i < n - 1; i++) {
            maxPos=Math.max(maxPos,i+nums[i]);
            if(i==curEnd){
                jump++;
                curEnd=maxPos;
                if(curEnd>=n-1){
                    break;
                }
            }
        }
        return jump;
    }
}
