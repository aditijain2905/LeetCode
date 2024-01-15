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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        if(head.next.val==head.val && head.next.next==null) return true;
        else if(head.next.val!=head.val && head.next.next==null) return false;
        
        ListNode s=head;
        ListNode l=head;
      int  count=0;
        while(l.next!=null && l.next.next!=null){
            count++;
            s=s.next;
            l=l.next.next;
        }
       
       s=s.next;
      ListNode r =   reverse(head,s);
         if(l.next==null) r=r.next;
        while(r!=null){
            if(r.val!=s.val) return false;
            r=r.next;
            s=s.next;
        }
        return true;
        
         }
    public ListNode reverse(ListNode head,ListNode s){
        if(head.next==null) return head; 
        ListNode temp=head.next;
        if(temp.next==s) {temp.next=head;
                          head.next=null;
                         return temp;}
        ListNode prev=head;
        while(temp!=s && temp!=null && temp.next!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head.next=null;
        return prev;
    }
    
}