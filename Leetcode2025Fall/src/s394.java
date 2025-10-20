import java.util.Stack;

/**
 * @Auther: WuZilong
 * @Date: 2025/10/20 23:16
 * @Description:
 */
public class s394 {
    public String decodeString(String s) {
        Stack<Integer> sInt=new Stack<>();
        Stack<String> sStr=new Stack<>();
        int num=0;
        String curStr="";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isDigit(c)){//数字
                num=num*10+c-'0';
            } else if (c=='[') {//左括号
                sStr.push(curStr);
                sInt.push(num);
                num=0;
                curStr="";
            } else if (c==']') {//右括号 解码
                int n=sInt.pop();
                String tmp=sStr.pop();
                for (int j = 0; j < n; j++) {
                    tmp=tmp+curStr;
                }
                curStr=tmp;
            } else {//字符
                curStr=curStr+c;
            }
        }
        return curStr;
    }
}
