import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class test03 {
}


class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        for (int l=0,r = 0; r < s.length(); r++) {
            char c=s.charAt(r);
            map.merge(c,1,Integer::sum);
            while(map.get(c)>1){
                map.merge(s.charAt(l),-1,Integer::sum);
                l++;
            }
            max= Math.max(max,r-l+1);
        }
        return max;
    }
}