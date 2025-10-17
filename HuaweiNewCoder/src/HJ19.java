import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class HJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String pathStr = sc.next();
            int line = sc.nextInt();
            String[] strs = pathStr.split("\\\\");
            String path = "";
            path = strs[strs.length - 1];
            if (path.length() > 16) {
                path = path.substring(path.length() - 16);
            }
            String key = path + " " + line;
            map.merge(key, 1, Integer::sum);
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (map.size() - count <= 8) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            count++;
        }
    }
}
