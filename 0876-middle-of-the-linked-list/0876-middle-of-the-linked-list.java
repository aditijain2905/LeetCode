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
        ListNode s = head;
        ListNode l = head;
        int count=0;
        while(l.next!=null && l.next.next!=null){
            s=s.next;
            l=l.next.next;
            count++;
        }
        if(l.next!=null){
        return s.next;
        }
        return s;
    }
}