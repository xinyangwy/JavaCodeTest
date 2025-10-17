public class test83 {
}



class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            ListNode p=cur;
            while (p.val==p.next.val){
                p.next=p.next.next;
            }
            cur.next=p.next;
        }
        return head;
    }
}