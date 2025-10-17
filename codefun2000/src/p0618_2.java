import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p0618_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<int []> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line=sc.next();
            list.add(getVersion(line));
        }
        String ver =sc.next();
//        System.out.println(ver);
        list.sort((o1,o2)->{
            if(o1[0]==o2[0]){
                if(o1[1]==o2[1]){
                    return o2[2]-o1[2];
                }
                return o2[1]-o1[1];
            }
            return o2[0]-o1[0];
        });
        boolean isOut=false;
        if(ver.equals("*")){
            int []ints=list.get(0);
            spell(ints);
            isOut=true;
        }else if(ver.startsWith("^")){
            int []version=getVersion(ver.replaceAll("\\^",""));
            int major= version[0];
            int minor= version[1];
            int patch= version[2];
            for (int[] ints : list) {
                if(ints[0]==major && ints[1]>=minor && ints[2]>=patch){
                    spell(ints);
                    isOut=true;
                    break;
                }
            }
        } else if (ver.startsWith("-") || ver.startsWith("~")) {
            int []version=getVersion(ver.replaceAll("[-~]",""));
            int major= version[0];
            int minor= version[1];
            int patch= version[2];
            for (int[] ints : list) {
                if(ints[0]==major && ints[1]==minor && ints[2]>=patch){
                    spell(ints);
                    isOut=true;
                    break;
                }
            }
        }
        if(!isOut){
            System.out.println("None");
        }
    }
    private static int[] getVersion(String str){

        String []words=str.split("\\.");
        int []nums=new int[3];
        for (int i = 0; i < words.length; i++) {
            nums[i]=Integer.parseInt(words[i]);
        }
        return nums;
    }

    public static void spell(int []ints){
        if(ints[1]==0){
            System.out.println(ints[0]);
        }else if(ints[2]==0){
            System.out.println(ints[0]+"."+ints[1]);
        }else{
            System.out.println(ints[0]+"."+ints[1]+"."+ints[2]);
        }
    }

}
