import java.util.Scanner;
import java.util.regex.Pattern;

public class HJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            if(str.length()<8){
                System.out.println("NG");
                continue;
            }
            if(match(str)){
                System.out.println("NG");
                continue;
            }
            if(!getSubString(str)){
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }

    private static boolean getSubString(String str) {
        for(int i=3;i<str.length();i++){
            if(str.substring(i).contains(str.substring(i-3,i))){
                return false;
            }
        }
        return true;
    }

    private static boolean match(String str){
        int count=0;
        Pattern p1=Pattern.compile("[A-Z]");
        if(p1.matcher(str).find()){
            count++;
        }
        Pattern p2=Pattern.compile("[a-z]");
        if(p2.matcher(str).find()){
            count++;
        }
        Pattern p3=Pattern.compile("[0-9]");
        if(p3.matcher(str).find()){
            count++;
        }
        Pattern p4=Pattern.compile("[^a-zA-Z0-9]");
        if(p4.matcher(str).find()){
            count++;
        }
        if(count>=3){
            return false;
        }
        return true;
    }
}
