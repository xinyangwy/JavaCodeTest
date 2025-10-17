import java.util.Scanner;

public class HJ40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []ch=sc.nextLine().toCharArray();
        int numLetter=0,numEmpty=0,numN=0,numOther=0;
        for (char c : ch) {
            if(Character.isLetter(c)){
                numLetter++;
            } else if (c == ' ') {
                numEmpty++;
            } else if (Character.isDigit(c)) {
                numN++;
            }else {
                numOther++;
            }
        }
        System.out.println(numLetter);
        System.out.println(numEmpty);
        System.out.println(numN);
        System.out.println(numOther);
    }
}
