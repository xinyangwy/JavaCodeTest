import java.util.HashSet;
import java.util.List;

public class test82 {
    public static void main(String[] args) {

    }
}


class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode dummyHead=new ListNode(0,head);
        ListNode cur=dummyHead;
        while (cur.next!=null && cur.next.next!=null){
            if(cur.next.val==cur.next.next.val){
                ListNode post=cur.next;
                while(post.val==post.next.val){
                    post=post.next;
                }
                cur.next=post.next;
            }else{
                cur=cur.next;
            }
        }
        return dummyHead.next;
    }
}