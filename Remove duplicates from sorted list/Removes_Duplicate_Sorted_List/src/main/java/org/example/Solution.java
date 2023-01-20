package org.example;

class Solution {
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode out = new ListNode(),t = out;

        while(head!=null){
            while(head.next!=null && head.val==head.next.val)
                head=head.next;
            t.next=new ListNode(head.val);
            t=t.next;
            head=head.next;
        }
        return out.next;
    }
}
