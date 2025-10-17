import javax.imageio.metadata.IIOMetadataNode;
import java.util.Scanner;

public class HJ54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []words=sc.nextLine().split(",");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("...")){
                long left= Long.parseLong(words[i-1]);
                long right= Long.parseLong(words[i+1]);
                System.out.println(right-left-1);
                return;
            }
        }
    }
}
