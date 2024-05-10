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
    
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
      
          
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
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
    
    public boolean isPalindrome(ListNode head) {
       ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);
        ListNode rereverse=headSecond;
        
        while(head!=null && headSecond!=null){
            if(head.val !=headSecond.val){
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        
        reverseList(rereverse);
        
        return head== null || headSecond==null;
    }
}