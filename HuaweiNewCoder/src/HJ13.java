import java.util.Scanner;

public class HJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        String []words=line.split(" ");
        for (int i = words.length-1; i >=0; i--) {
            System.out.print(words[i]+" ");
        }
    }
}
