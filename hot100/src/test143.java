import java.nio.file.LinkOption;

public class test143 {
}


class Solution143 {
    public void reorderList(ListNode head) {
        ListNode mid=findMid(head);
        ListNode l2=reverse(mid);
        merge(head,l2);
    }

    public ListNode findMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode dummyHead=new ListNode();
        dummyHead.next=null;
        ListNode cur=dummyHead;
        while(cur!=null){
            ListNode post=cur.next;
            cur.next=dummyHead.next;
            dummyHead.next=cur;
            cur=post;
        }
        return dummyHead.next;
    }

    public void merge(ListNode l1,ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        while(l1!=null && l2!=null){
            p1=l1.next;
            p2=l2.next;

            l1.next=l2;
            l1=p1;
            l2.next=l1;
            l2=p2;
        }
    }
}