import com.sun.jdi.ArrayReference;
import com.sun.source.tree.Tree;

import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuUI;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(intToRoman(3749));
        Solution s = new Solution();
        s.lengthOfLongestSubstring("dvdf");
//        s.numSquares(50);
//        System.out.println(s.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
//        System.out.println(s.simplifyPath("/home/user/Documents/../Pictures"));
//        System.out.println(
//                Arrays.deepToString(s.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}))
//        );
//        System.out.println(s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
//        System.out.println(s.isValidSudoku(new char[][]{
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        })); // 输出：true（该数独有效）
//        s.convert("convert", 3);
//        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
    }
}


//    public static String intToRoman(int num) {
//        String strs[] = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String res = "";
//        for (int i = 0; i < nums.length; i++) {
//            while (nums[i] <= num) {
//                num -= nums[i];
//                res += strs[i];
//            }
//            if (num == 0) {
//                break;
//            }
//        }
//        return res;
//    }
//}


//class Solution {
//    public boolean isPalindrome(String s) {
//        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        String sb = new StringBuilder(str).reverse().toString();
//        return sb.equals(str);
//    }
//}


////58
//class Solution {
//    public int lengthOfLastWord(String s) {
//        String []strs=s.split(" ");
//        return strs[strs.length-1].length();
//    }
//}


////14
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        String firstStr=strs[0];
//        String res="";
//        for (int i = 0; i < firstStr.length(); i++) {
//            boolean flag=true;
//            for (int j = 1; j < strs.length ; j++) {
//                if(firstStr.charAt(i)!=strs[j].charAt(i) || i >= strs[j].length()){
//                    flag=false;
//                }
//            }
//            if(flag){
//                res+=firstStr.charAt(i);
//            }else{
//                break;
//            }
//        }
//        return res;
//    }
//}

////151
//class Solution {
//    public String reverseWords(String s) {
//        s.trim();
//        List<String> wordlist=Arrays.asList(s.split("\\s+"));
//        Collections.reverse(wordlist);
//        return String.join(" ",wordlist);
//
//    }
//}
//
////6
//class Solution {
//    public String convert(String s, int numRows) {
//        if(numRows==1){
//            return s;
//        }
//        List<StringBuilder> rows=new ArrayList<>();
//        int  len=s.length();
//        for (int i = 0; i < Math.min(len, numRows); i++) {
//            rows.add(new StringBuilder());
//        }//初始化
//
//        int currentRow =0;
//        int step=-1;//遍历的方向
//        for (char c : s.toCharArray()) {
//            rows.get(currentRow).append(c);
//            //换方向
//            if(currentRow==numRows-1 || currentRow==0){
//                step=-step;
//            }
//            currentRow+=step;
//        }
//        StringBuilder res=new StringBuilder();
//        for (StringBuilder row : rows) {
//            res.append(row);
//        }
//        return res.toString();
//    }
//}


////392
//class Solution {
//    public boolean isSubsequence(String s, String t) {
//        int index=0;
//        for (int i = 0; i < t.length(); i++) {
//            if(index<s.length() && s.charAt(index)==t.charAt(i)){
//                index++;
//            }
//        }
//        if(index!=s.length()){
//            return false;
//        }
//        return true;
//    }
//}

//209
//class Solution {
//    public int minSubArrayLen(int target, int[] nums) {
//        int l = 0;
//        int sum = 0;
//        int res = Integer.MAX_VALUE;
//        for (int r = 0; r < nums.length; r++) {
//            sum += nums[r];
//            while (sum >= target) {
//                res = Math.min(res, r - l + 1);
//                sum -= nums[l++];
//            }
//        }
//        return res == Integer.MAX_VALUE ? 0 : res;
//    }
//}


//3
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int res=0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int l=0,r = 0 ; r < s.length(); r++) {
//            char c=s.charAt(r);
//            map.merge(c,1,Integer::sum);
//            while(map.get(c)>1){
//                map.merge(s.charAt(l),-1,Integer::sum);
//                l++;
//            }
//            res=Math.max(res,r-l+1);
//        }
//        return res;
//    }
//}

////36
//class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        //行列
//        for (int i = 0; i < 9; i++) {
//            Set<Character> setL=new HashSet<>();
//            Set<Character> setR=new HashSet<>();
//            for (int j = 0; j < 9; j++) {
//                if(board[i][j]=='.'){
//                    continue;
//                }
//                if(setL.contains(board[i][j])){
//                    return false;
//                }
//                setL.add(board[i][j]);
//
//
//
//                if(board[j][i]=='.'){
//                    continue;
//                }
//                if(setR.contains(board[j][i])){
//                    return false;
//                }
//                setR.add(board[j][i]);
//
//
//            }
//        }
//        //3x3
//
//        for (int iBegin = 0; iBegin < 9; iBegin+=3) {
//            for (int jBegin = 0; jBegin < 9; jBegin+=3) {
//
//                Set<Character> set=new HashSet<>();
//                for (int i = iBegin; i < iBegin+3; i++) {
//                    for (int j = jBegin; j < jBegin+3; j++) {
//                        if(board[i][j]=='.'){
//                            continue;
//                        }
//                        if(set.contains(board[i][j])){
//                            return false;
//                        }
//                        set.add(board[i][j]);
//                    }
//                }
//
//
//            }
//        }
//        return true;
//    }
//}
//
//
////73
//class Solution {
//    public void setZeroes(int[][] matrix) {
//        int n=matrix.length;
//        int m=matrix[0].length;
//        HashSet<Integer> rowSet = new HashSet<>();
//        HashSet<Integer> lineSet = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(matrix[i][j]==0){
//                    lineSet.add(i);
//                    rowSet.add(j);
//                }
//            }
//        }
//        for (Integer i : lineSet) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j]=0;
//            }
//        }
//        for (Integer i : rowSet) {
//            for (int j = 0; j < n; j++) {
//                matrix[j][i]=0;
//            }
//        }
//
//    }
//}

//
//
////383
//class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        int []m=new int[26];
//        int []r=new int[26];
//        for (char c : magazine.toCharArray()) {
//            m[c-'a']++;
//        }
//        for (char c : ransomNote.toCharArray()) {
//            r[c-'a']++;
//        }
//        for (int i = 0; i < r.length; i++) {
//            if(r[i]>0){
//                m[i]-=r[i];
//                if(m[i]<0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}

//
////205
//class Solution {
//    public boolean isIsomorphic(String s, String t) {
//        HashMap<Character, Character> s2tMap = new HashMap<>();
//        HashMap<Character, Character> t2sMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char sChar=s.charAt(i);
//            char tChar=t.charAt(i);
//            if(s2tMap.containsKey(sChar) && s2tMap.get(sChar)!=tChar || t2sMap.containsKey(tChar) && t2sMap.get(tChar)!=sChar){
//                return false;
//            }
//            s2tMap.put(sChar,tChar);
//            t2sMap.put(tChar,sChar);
//        }
//        return true;
//    }
//}
//
//
//// 290
//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//        String[] strs = s.split(" ");
//        int n = pattern.length();
//        int m = strs.length;
//        if (n != m) {
//            return false;
//        }
//        HashMap<Character, String> p2s = new HashMap<>();
//        HashMap<String, Character> s2p = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            char c = pattern.charAt(i);
//            String str = strs[i];
//            if (p2s.containsKey(c) && !Objects.equals(p2s.get(c), str) || s2p.containsKey(str) && s2p.get(str) != c) {
//                return false;
//            }
//            p2s.put(c, str);
//            s2p.put(str, c);
//        }
//        return true;
//    }
//}


////49
//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String,ArrayList<String>> map = new HashMap<>();
//        for (String str : strs) {
//            char[] chs= str.toCharArray();
//            Arrays.sort(chs);
//            String key= new String(chs);
//            map.putIfAbsent(key,new ArrayList<>());
//            map.get(key).add(str);
//        }
//        List<List<String>> res=new ArrayList<>();
//        for (String s : map.keySet()) {
//            res.add(map.get(s));
//        }
//        return res;
//    }
////}
//
////1
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(map.containsKey(target-nums[i])){
//                return new int[]{i,map.get(target-nums[i])};
//            }
//            map.put(nums[i],i);
//        }
//        return new int[]{};
//    }
//}
//202
//class Solution {
//    public boolean isHappy(int n) {
//        if(n==1)return true;
//        int step=0;
//        while (n != 1) {
//            String str = Integer.toString(n);
//            char[] chs = str.toCharArray();
//            n=0;
//            for (char ch : chs) {
//                n+= (ch-'0')*(ch-'0');
//            }
//            if(n==1){
//                return true;
//            }
//
//            step++;
//            if(step==9999){
//                break;
//            }
//        }
//        return false;
//    }
//}

//
////219
//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k){
//                return true;
//            }
//            map.put(nums[i],i);
//        }
//        return false;
//    }
//}


//
////128
//class Solution {
//    public int longestConsecutive(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int ans=0;
//        for (Integer x : set) {
//            if(set.contains(x-1)){
//                continue;
//            }
//            int y=x+1;
//            while (set.contains(y)){
//                y++;
//            }
//            //x  ,  y-1
//            ans=Math.max(ans,y-x);
//        }
//        return ans;
//    }
//}


////228
//class Solution {
//    public List<String> summaryRanges(int[] nums) {
//        List<String> res=new ArrayList<>();
//        int n = nums.length;
//        int i = 0;
//        while (i < n) {
//            int  begin =i;
//            while(i+1<n && nums[i+1]-nums[i]==1){
//                i++;
//            }
//            if(i==begin){
//                res.add(String.valueOf(nums[i]));
//            }else{
//                res.add(nums[begin]+"->"+nums[i]);
//            }
//            i++;
//        }
//        return res;
//    }
//}


////56
//class Solution {
//    public int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals, (o1, o2) -> (o1[0] - o2[0]));
//        List<int[]> res = new ArrayList<>();
//        int n = intervals.length;
//        for (int i = 0; i < n; i++) {
//            if (i != 0 && intervals[i][0] <= res.get(res.size() - 1)[1]) {
//                res.get(res.size() - 1)[1]=Math.max(res.get(res.size() - 1)[1],intervals[i][1]);
//            } else {
//                res.add(intervals[i]);
//            }
//        }
//        return res.toArray(new int[res.size()][2]);
//    }
//}

//57
//class Solution {
//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        List<int[]> res=new ArrayList<>();
//        int pos=0;
//        for (int[] interval : intervals) {
//            if(interval[1]<newInterval[0]){
//                res.add(interval);
//                pos++;
//            } else if (newInterval[1]<interval[0]  ) {
//                res.add(interval);
//            }else {
//                newInterval[0]=Math.min(newInterval[0],interval[0]);
//                newInterval[1]=Math.max(newInterval[1],interval[1]);
//            }
//        }
//        res.add(pos,new int[]{newInterval[0],newInterval[1]});
//        return res.toArray(new int[res.size()][2]);
//    }
//}

////20
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> stk = new Stack<>();
//        for (char c : s.toCharArray()) {
//            if (c == ')') {
//                if (stk.isEmpty() || stk.pop() != '(') {
//                    return false;
//                }
//            } else if (c == ']') {
//                if (stk.isEmpty() || stk.pop() != '[') {
//                    return false;
//                }
//            } else if (c == '}') {
//                if (stk.isEmpty() || stk.pop() != '{') {
//                    return false;
//                }
//            } else {
//                stk.push(c);
//            }
//        }
//        return stk.isEmpty();
//    }
//}


//71
//class Solution {
//    public String simplifyPath(String path) {
//        String[] strs = path.split("/");
//        Stack<String> stk = new Stack<>();
//        for (String str : strs) {
//            if(str.equals(".") || str.isEmpty() || str.equals("/")){
//                continue;
//            }else if(str.equals("..")){
//                if(!stk.isEmpty()){
//                    stk.pop();
//                }
//            } else {
//                stk.push(str);
//            }
//        }
//        if(stk.isEmpty()){
//            return "/";
//        }
//        List<String> resList=stk.stream().toList();
//        StringBuilder res= new StringBuilder();
//        for (String string : resList) {
//            res.append("/").append(string);
//        }
//        return res.toString();
//    }
//}


////150
//class Solution {
//    public int evalRPN(String[] tokens) {
//        Stack<Integer> s = new Stack<>();
//        for (String token : tokens) {
//            if (isDigit(token)) {
//                s.push(Integer.parseInt(token));
//            } else {
//                int y = s.pop();
//                int x = s.pop();
//                s.push(fun(x, y, token));
//            }
//        }
//        return s.pop();
//    }
//
//    Boolean isDigit(String str) {
//        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
//            return false;
//        }
//        return true;
//    }
//
//    int fun(int x, int y, String str) {
//        switch (str) {
//            case "+" -> {
//                return x + y;
//            }
//            case "-" -> {
//                return x - y;
//            }
//            case "*" -> {
//                return x * y;
//            }
//            case "/" -> {
//                return x / y;
//            }
//        }
//        return x;
//    }
//}

////200
//class Solution {
//    int dirs[][]=new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
//    public int numIslands(char[][] grid) {
//        int n=grid.length;
//        int m=grid[0].length;
//        int res=0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(grid[i][j]=='1'){
//                    dfs(grid,i,j);
//                    res++;
//                }
//            }
//        }
//        return res;
//    }
//
//    void dfs(char[][] grid, int i, int j){
//        grid[i][j]='0';
//        for (int[] dir : dirs) {
//            int x=i+dir[0];
//            int y=j+dir[1];
//            if(x>=0 && x<grid.length && y>=0 &&y<grid[0].length && grid[x][y]=='1'){
//                dfs(grid,x,y);
//            }
//        }
//    }
//
//}
//

////130
//class Solution {
//    int [][]dirs=new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
//    public void solve(char[][] board) {
//        int n=board.length;
//        int m=board[0].length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(i==0 ||j==0 ||i==n-1||j==m-1){
//                    if(board[i][j]=='O'){
//                        dfs(board,i,j);
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(board[i][j]=='O'){
//                    board[i][j]='X';
//                }
//                if(board[i][j]=='#'){
//                    board[i][j]='O';
//                }
//            }
//        }
//
//
//    }
//
//    private void dfs(char[][] board, int i, int j) {
//        board[i][j]='#';
//        for (int[] dir : dirs) {
//            int x = i + dir[0];
//            int y = j + dir[1];
//            if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'O') {
//                dfs(board, x, y);
//            }
//        }
//    }
//}


////70
//class Solution {
//    public int climbStairs(int n){
//        if(n<=2){
//            return n;
//        }
//        int dp[]=new int[n+1];
//        dp[1]=1;
//        dp[2]=2;
//        for (int i = 3; i <= n; i++) {
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }
//}


////198
//class Solution {
//    public int rob(int[] nums) {
//        int n = nums.length;
//        int dp[] = new int[n];
//        if (n == 1) return nums[0];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);
//        for (int i = 2; i < n; i++) {
//            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
//        }
//        return dp[n - 1];
//    }
//}

//5
//class Solution {
//    public String longestPalindrome(String s) {
//        int n = s.length();
//        boolean[][] dp = new boolean[n][n];
//        char[] ch = s.toCharArray();
//        for (int i = 0; i < s.length(); i++) {
//            dp[i][i] = true;
//        }
//        int lenMax = 1, begin = 0, end = 0;
//        for (int j = 1; j < n; j++) {
//            for (int i = j - 1; i >= 0; i--) {
//                if (ch[i] != ch[j]) {
//                    dp[i][j] = false;
//                } else {
//                    if (j - i == 1) {
//                        dp[i][j] = true;
//                    } else {
//                        dp[i][j] = dp[i + 1][j - 1];
//                    }
//                }
//                if (dp[i][j] && j - i + 1 > lenMax) {
//                    lenMax = j - i + 1;
//                    begin = i;
//                    end = j;
//                }
//            }
//        }
//        return s.substring(begin, end + 1);
//    }
//}


//63
//


//class Solution {
//    public int maxDepth(TreeNode root) {
//        return PreOrder(root);
//    }
//
//    private int PreOrder(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        return Math.max(PreOrder(root.left),PreOrder(root.right))+1;
//    }
//}


//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p==null && q==null){
//            return true;
//        }
//        if(p==null || q==null){
//            return false;
//        }
//        if(p.val!=q.val){
//            return false;
//        }
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }
//}
//

////226
//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        if(root==null){
//            return root;
//        }
//        TreeNode tmp=root.left;
//        root.left=root.right;
//        root.right=tmp;
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }
//}


////167
//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            map.put(numbers[i],i);
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if(target-numbers[i]==numbers[i]){
//                return new int[]{i+1,i+2};
//            }
//            if(map.containsKey(target-numbers[i])){
//                return new int[]{i+1,map.get(target-numbers[i])+1};
//            }
//        }
//        return new int[]{};
//    }
//}
//11


//class Solution {
//    public int maxArea(int[] height) {
//        int  i=0,j=height.length-1;
//        int res=0;
//        while (i<j){
//            if(height[i]<height[j]){
//                res=Math.max(res,height[i]*(j-i+1));
//                i++;
//            }else {
//                res=Math.max(res,height[j]*(j-i+1));
//                j--;
//            }
//        }
//        return res;
//    }
//}

//class Solution {
//    public int romanToInt(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);

//        int  res=0;
//        for (int i = 1; i < s.length(); i++) {
//            int left=map.get(s.charAt(i-1));
//            int right=map.get(s.charAt(i));
//            res+=left<right?-left:left;
//        }
//        return res+map.get(s.charAt(s.length()-1));
//    }
//}


//76
//class Solution {
//    public String minWindow(String s, String t) {
//        int n = s.length();
//        int start = 0, end = 0, minLen = Integer.MAX_VALUE;
//        for (int left = 0, right = 0; right < n; right++) {
//
//// 当窗口包含t时，持续收缩左指针，寻找最小窗口
//            while (isContained(s.substring(left, right + 1), t)) { // 注意右边界是right+1（因为substring右开）
//                int currentLen = right - left + 1; // 当前窗口长度（right+1 - left）
//                if (currentLen < minLen) {
//                    minLen = currentLen;
//                    start = left;
//                    end = right + 1; // 匹配substring的右开区间
//                }
//                left++; // 收缩左指针，尝试更小的窗口
//            }
//        }
//        return s.substring(start, end);
//    }
//
//    private boolean isContained(String substring, String t) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        HashMap<Character, Integer> mapt = new HashMap<>();
//        for (char c : substring.toCharArray()) {
//            map.merge(c, 1, Integer::sum);
//        }
//        for (char c : t.toCharArray()) {
//            mapt.merge(c, 1, Integer::sum);
//        }
//        for (Character c : mapt.keySet()) {
//            if (!map.containsKey(c) || map.get(c) < mapt.get(c)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}


////153
//class Solution {
//    public int findMin(int[] nums) {
//        int left=0,right =nums.length-1;
//        while(left<=right){
//            int mid=(left+right)/2;
//            if(nums[left]<=nums[mid] && nums[mid]<=nums[right]){
//                return nums[left];
//            } else if (nums[left] <= nums[mid]) {
//                left=mid+1;
//            } else if(nums[mid] <= nums[right]) {
//                right=mid;
//            }
//        }
//        return nums[0];
//    }
//}
//


////45
//class Solution {
//    public int jump(int[] nums) {
//        int n=nums.length;
//        if(n==0 ||n==1){
//            return 0;
//        }
//        int maxDistance =0,curDistanceEnd =0,res=0;
//        for (int i = 0; i < n-1; i++) {
//            maxDistance=Math.max(maxDistance,i+nums[i]);
//            if(i==curDistanceEnd){
//                curDistanceEnd=maxDistance;
//                res++;
//            }
//        }
//        return res;
//
//    }
//}


//
//class Solution {
//    public void rotate(int[][] matrix) {
//        int n=matrix.length;
//        int m=matrix[0].length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                int tmp=matrix[i][j];
//                matrix[i][j]=matrix[j][i];
//                matrix[j][i]=tmp;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <m/2; j++) {
//                int tmp=matrix[i][j];
//                matrix[i][j]=matrix[i][m-1-j];
//                matrix[i][m-1-j]=tmp;
//            }
//        }
//    }
//}
//
////763
//class Solution {
//    public List<Integer> partitionLabels(String s) {
//        int end=0;
//        int n=s.length();
//        int start=0;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            end=Math.max(end,s.lastIndexOf(s.charAt(i)));
//            if(i==end){
//                int tmp=end-start+1;
//                list.add(tmp);
//                start=i+1;
//            }
//        }
//        return list;
//    }
////}
//
////198
//class Solution {
//    public int numSquares(int n) {
//        int []nums=new int[101];
//        for (int i = 0; i <= 100; i++) {
//            nums[i]=i*i;
//        }
//        int []dp=new int[n+1];
//        int max=Integer.MAX_VALUE;
//        for (int i = 0; i < n+1; i++) {
//            dp[i]=max;
//        }
//        dp[0]=0;
//        for (int i = 0; i <=100; i++) {
//            for (int j = nums[i]; j <= n; j++) {
//                if(j-nums[i]!=max){
//                    dp[i]=Math.min(dp[i],dp[i-nums[i]]+1);
//                }
//            }
//        }
//        return dp[n];
//    }
//}

//322
//class Solution {
//    public int coinChange(int[] coins, int amount) {
//        int []dp=new int[amount+1];
//        int max=Integer.MAX_VALUE;
//        for (int i = 0; i <= amount; i++) {
//            dp[i]=max;
//        }
//        dp[0]=0;
//        int n=coins.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = coins[i]; j <= amount; j++) {
//                if(dp[j-coins[i]]!=max){
//                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
//                }
//            }
//        }
//        return dp[amount];
//    }
//}

//139
//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        HashSet<String> set = new HashSet<>(wordDict);
//        int n = s.length();
//        boolean[] dp = new boolean[n + 1];
//        dp[0] = true;
//        for (int j = 1; j <= n; j++) {//
//            for (int i = 0; i < j; i++) {
//                if (set.contains(s.substring(i, j)) && dp[i]) {
//                    dp[j] = true;
//                }
//            }
//        }
//        return dp[n];
////    }
////}
//
////300
//class Solution {
//    public int lengthOfLIS(int[] nums) {
//        int  n=nums.length;
//        int []dp=new int [n];
//        Arrays.fill(dp,1);
//        int res=1;
//        for (int j = 1; j < n; j++) {
//            for (int i = 0; i < j; i++) {
//                //如果j之前有比他小的数
//                if(nums[i]<nums[j]){
//                    dp[j]=Math.max(dp[j],dp[i]+1);
//                }
//            }
//            res=Math.max(res,dp[j]);
//        }
//        return res;
//    }
//}


//016
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen=0;
        for (int l = 0,r=0; r < n; r++) {
            map.merge(s.charAt(r),1,Integer::sum);
            while (l<r && map.get(s.charAt(r))>1){
                map.merge(s.charAt(l),-1,Integer::sum);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}



