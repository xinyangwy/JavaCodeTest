


public class test160 {
    public static void main(String[] args) {

    }
}


class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0,len2=0;
        ListNode pa=headA;
        ListNode pb=headB;
        while(pa!=null){
            len1++;
            pa=pa.next;
        }
        while(pb!=null){
            len2++;
            pb=pb.next;
        }
        int detla=Math.abs(len1-len2);
        pb=headB;
        pa=headA;
        if(len2>len1){
            while(detla!=0){
                pb=pb.next;
            }
        }else if(len2<len1){
            while(detla!=0){
                pa=pa.next;
            }
        }

        while(pa!=pb){
            pa=pa.next;
            pb=pb.next;
            if(pa==pb){
                return pa;
            }
        }
        return null;
    }
}
