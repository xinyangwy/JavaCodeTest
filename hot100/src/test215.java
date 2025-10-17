import java.util.Random;

public class test215 {
}


class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int len=nums.length;
        return sort(nums,0,len-1,len-k);
    }
    private int sort(int[] nums, int left,int right,int x){
        int index=partition(nums,left,right);
        if(index==x){
            return nums[index];
        }else if(index>x){//确定的这个下标比目标值大
            return sort(nums,left,index-1,x);
        }else {
            return sort(nums,index+1,right,x);
        }
    }
    //返回已经确定位置的index
    private int partition(int[] nums, int l,int r){
        Random random = new Random();
        int randomIndex = l + random.nextInt(r - l + 1);
        int mid=nums[randomIndex];
        while(l<r){
            while (l<r && nums[r]>=mid)r--;
            nums[l]=nums[r];
            while (l<r && nums[l]<=mid)l++;
            nums[r]=nums[l];
        }
        nums[l]=mid;
        return l;
    }
}