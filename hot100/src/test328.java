public class test328 {
}


class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead=new ListNode();
        ListNode oddTail=oddHead;
        ListNode evenHead=new ListNode();
        ListNode evenTail=evenHead;
        boolean isOdd=true;
        while (head!=null){
            if(isOdd){
                oddTail.next=head;
                oddTail=oddTail.next;
            }else{
                evenTail.next=head;
                evenTail=evenTail.next;
            }
            head.next=head;
            isOdd=!isOdd;
        }
        oddTail.next=evenHead.next;
        evenTail.next=null;
        return oddHead.next;
    }
}