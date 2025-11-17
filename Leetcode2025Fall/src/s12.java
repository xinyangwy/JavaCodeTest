public class s12 {
    public String intToRoman(int num) {
        String strs[] = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String res = "";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < num) {
                num -= nums[i];
                res += strs[i];
            }
            if (num == 0) {
                break;
            }
        }
        return res;
    }
}
