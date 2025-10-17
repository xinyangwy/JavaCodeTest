public class test0205 {
}

class Solution0205 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode dummyHead=new ListNode();
        ListNode cur=dummyHead;
        int carry=0;
        while(p1!=null || p2!=null){
            int sum=(p1!=null?p1.val:0)+(p2!=null?p2.val:0)+carry;
            carry =sum/10;
            cur.next=new ListNode(sum%10);

            cur=cur.next;
            if(p1!=null)p1=p1.next;
            if(p2!=null)p2=p2.next;
        }
        if(carry!=0){
            cur.next=new ListNode(carry);
            cur=cur.next;
        }
        return dummyHead.next;
    }
}