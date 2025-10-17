import javax.print.DocFlavor;
import java.awt.*;
import java.util.*;
import java.util.regex.Pattern;

public class HJ30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = getMerge(str);
//        System.out.println(str);
        char []ch=str.toCharArray();
        Pattern p=Pattern.compile("[^1-9a-zA-Z]");
        for (int i = 0; i < ch.length; i++) {
            if(p.matcher(String.valueOf(ch[i])).find()){
                continue;
            }
            ch[i]=trans(ch[i]);
//            ch[i]=trans2(ch[i]);
        }

        for (char c : ch) {
            System.out.print(c);
        }

    }
    //1.模拟
    private static Character trans(Character c) {
        Pattern p2=Pattern.compile("[^1-9a-fA-F]");
        if(p2.matcher(String.valueOf(c)).find()){
            return c;
        }else{
            String strBin= Integer.toBinaryString(Integer.parseInt(String.valueOf(c),16));    //十六进制转为二进制
            StringBuilder sb=new StringBuilder(strBin).reverse();  //翻转
            while(sb.length()<4){
                sb.append("0");
            }
            int n=Integer.parseInt(sb.toString(),2);  //转为十进制
            String str16=Integer.toHexString(n).toUpperCase();   //十进制转为十六进制
            return str16.charAt(0);
        }
    }

    //2.打表
    private static Character trans2(Character c) {
        //  0    1    2   3     4     5   6    7   8     9   a    b    c    d     e   f
        //0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111
        //  0    8   4    C   2    A     6    E   1    9    5    D    3    B     7    F
        HashMap<Character, Character> map = new HashMap<>();
        map.put('1','8');
        map.put('2','4');
        map.put('3', 'C');
        map.put('4', '2');
        map.put('5', 'A');
        map.put('6', '6');
        map.put('7', 'E');
        map.put('8', '1');
        map.put('9', '9');
        map.put('a', '5');
        map.put('b', 'D');
        map.put('c', '3');
        map.put('d', 'B');
        map.put('e', '7');
        map.put('f', 'F');
        map.put('A','5');
        map.put('B','D');
        map.put('C','3');
        map.put('D','B');
        map.put('E','7');
        map.put('F','F');
        if(map.containsKey(c)){
            return map.get(c);
        }
        return c;
    }



    private static String getMerge(String str) {
        str = str.replaceAll(" ", "");
        char[] ch = str.toCharArray();
        ArrayList<Character> chEven = new ArrayList<>();
        ArrayList<Character> chOdd = new ArrayList<>();
        int i = 0;
        for (i = 0; i < ch.length - 1; i += 2) {
            chEven.add(ch[i]);
            chOdd.add(ch[i + 1]);
        }
        if (i == ch.length - 1) {
            chEven.add(ch[i]);
        }
        Collections.sort(chEven);
        Collections.sort(chOdd);
        String res = "";
        for (int j = 0; j < chEven.size(); j++) {
            res += chEven.get(j);
            if (j < chOdd.size()) {
                res += chOdd.get(j);
            }
        }
        return res;
    }




}
