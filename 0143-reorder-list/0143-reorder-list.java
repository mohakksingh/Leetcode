/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;

    }

    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;

    }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }

        ListNode mid=getMid(head);
        ListNode hf=head;
        ListNode hs=reverseList(mid);

        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }

        if(hf!=null){
            hf.next=null;
        }
    }
}