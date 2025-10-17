public class test75 {
}


class Solution75 {
    public void sortColors(int[] nums) {
        int len=nums.length;
        int l=0,r=len-1,index=0;
        while(index<len){
            if(nums[index]==0){
                swap(nums,l++,index++);
            }else if(nums[index]==0){
                index++;
            }else{
                swap(nums,r--,index++);
            }
        }

    }
    public void swap(int[] nums,int a,int b) {
        int tmp=nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }

}
