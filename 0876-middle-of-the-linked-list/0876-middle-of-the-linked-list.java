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
    public ListNode middleNode(ListNode head) {
        ListNode i=head;
        ListNode j=head;
        while(j.next!=null && j.next.next!=null){
            i=i.next;
            j=j.next.next;
            }
        if(j.next!=null) i =i.next;
        return i;
        
        
    }
}