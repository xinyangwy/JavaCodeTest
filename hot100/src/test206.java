import java.util.List;
import java.util.Scanner;

public class test206 {
    public static void main(String[] args) {
        int vals[]=new int[]{1,2,3,4,5};
        ListNode head=new ListNode();
        ListNode cur=head;
        Scanner sc=new Scanner(System.in);
        for (int val : vals) {
            cur.next=new ListNode(val);
            cur=cur.next;
        }
        head=head.next;
        Solution206 s=new Solution206();
        ListNode p=s.reverseList(head);
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
    }
}


 class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode dummyhead=new ListNode();
        dummyhead.next=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode post=cur.next;
            cur.next=dummyhead.next;
            dummyhead.next=cur;
            cur=post;
        }
        return dummyhead.next;
    }
}