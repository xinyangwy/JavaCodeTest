import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test56 {
}


class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(o1,o2)->o1[0]-o2[0]);
        int n=intervals.length;
        List<int []> res=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i!=0 && intervals[i][0]<=res.get(res.size()-1)[1]){
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],intervals[i][1]);
            }else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}