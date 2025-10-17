/**
 * @Auther: WuZilong
 * @Date: 2025/10/13 11:54
 * @Description:
 */
public class s88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //移动nums1 的元素
        for (int i = m-1; i >=0; i--) {
            nums1[n+i]=nums1[i];
        }
        int p1=n,p2=0,cur=0;
        while (p1<m+n && p2<n){
            if(nums1[p1]<nums2[p2]){
                nums1[cur++]=nums1[p1++];
            }else {
                nums1[cur++]=nums2[p2++];
            }
        }
        while (p1<m+n){
            nums1[cur++]=nums1[p1++];
        }
        while (p2<n){
            nums1[cur++]=nums2[p2++];
        }
    }
}
