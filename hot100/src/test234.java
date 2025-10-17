import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test234 {
}


class Solution234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode p=head;
        while(p!=null){
            list.add(p.val);
            p=p.next;
        }
        int len=list.size();
        for (int i = 0; i < len; i++) {
            if(list.get(i)!=list.get(len-1-i)){
                return false;
            }
        }
        return true;
    }
}