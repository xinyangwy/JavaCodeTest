public class testLCR136 {
}


class Solution136 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            return head.next;
        }
        ListNode pre=head;
        ListNode p=head.next;
        while(p!=null){
            if(p.val==val){
                pre.next=p.next;
                p=pre.next;
            }
            p=p.next;
            pre.next=p;
        }
        return head;
    }
}