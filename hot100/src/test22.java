import java.util.ArrayList;
import java.util.List;

public class test22 {
}


class Solution22 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        String path = "";
        dfs(path, n, n);
        return res;
    }

    public void dfs(String path, int l, int r) {
        if (l == 0 && r == 0) {
            res.add(path);
        }
        if (l > r) {
            return;
        }
        if (l > 0) {
            dfs(path + "(", l - 1, r);
        }
        if (r > 0) {
            dfs(path + ")", l, r - 1);
        }
    }
}