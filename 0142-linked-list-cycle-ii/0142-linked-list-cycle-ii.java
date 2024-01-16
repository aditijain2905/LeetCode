/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
           ListNode s=head;
        ListNode l =head;
        while(l.next!=null && l.next.next!=null){
             s=s.next;
            l=l.next.next;
            if(s==l) break;
           
        }
        if(l.next==null || l.next.next==null) return null;
        s=head;
        int count=1;
        while(s!=l){
            count++;
            s=s.next;
            l=l.next;
        }
        
        return l;
        
    }
}