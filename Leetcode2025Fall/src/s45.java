/**
 * @Auther: WuZilong
 * @Date: 2025/10/17 16:33
 * @Description:
 */
public class s45 {
    public int jump(int[] nums) {
        int curDistanceEnd = 0, MaxDistance = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            // 在可覆盖区域内更新最大的覆盖区域
            MaxDistance = Math.max(MaxDistance, i + nums[i]);
            if (MaxDistance >= nums.length - 1) {
                cnt++; // 说明当前一步，再跳一步就到达了末尾
                return cnt;// 这里是实际上的出口
            }
            // 走到当前覆盖的最大区域时，更新下一步可达的最大区域
            if (i == curDistanceEnd) {
                curDistanceEnd = MaxDistance;
                cnt++;
            }
        }
        return cnt;
    }
}
