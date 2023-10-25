/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int d=0;
        ListNode temp = node;
        d=temp.next.val;
        temp.val=d;
        temp.next=temp.next.next;
      //  return node;
        
    }
}