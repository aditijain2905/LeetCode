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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head.next;
        ListNode prev=head;
        prev.next=null;
        while(temp.next!=null){
            ListNode next=temp.next;
          temp.next=prev;
            prev=temp;
            temp=next;
            
        }
        temp.next=prev;
        return temp;
        
    }
}