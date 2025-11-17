/**
 * @Auther: WuZilong
 * @Date: 2025/10/22 15:23
 * @Description:
 */
public class s238 {
    public int[] productExceptSelf(int[] nums) {
        //左边的所有数的乘积  和 右边的所有数的乘积
        int  n=nums.length;
        int []pre=new int[n];
        int []post=new int[n];
        int []muti=new int[n];
        pre[0]=1;
        post[n-1]=1;
        for (int i = 1; i < n; i++) {
            pre[i]=pre[i-1]*nums[i-1];
        }
        for (int i = n-2; i >= 0 ; i--) {
            post[i]=post[i+1]*nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            muti[i]=pre[i]*post[i];
        }
        return muti;
    }
}
