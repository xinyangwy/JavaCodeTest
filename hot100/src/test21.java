import java.util.HashSet;
import java.util.List;

public class test21 {
}



class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead=new ListNode();
        ListNode cur=newHead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        cur.next=list1==null?list2:list1;
        return newHead.next;
    }
}