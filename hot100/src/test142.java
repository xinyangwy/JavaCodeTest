import java.util.HashSet;

public class test142 {
}


class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode p=head;
        HashSet<ListNode> set=new HashSet<>();
        while(p!=null){
            if(set.contains(p)){
                return p;
            }
            set.add(p);
            p=p.next;
        }
        return null;
    }
}