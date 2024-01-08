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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode prev=temp;
        int count=0;
        while(temp!=null){
           // prev=temp;
            temp=temp.next;
            count++;
        }
        if(count<n) return head;
        if(count==n && head.next==null) return null;
        if(count-n==0) return head.next;
        int c=0;
        temp=head;
        prev=temp;
     //   System.out.print(count);
        while(c<count-n){
            if(c+1==count-n){
                if(temp.next.next!=null){
                temp.next=temp.next.next;
                break;
                }else{
                    temp.next=null;
                    break;
                }
            }
            temp=temp.next;
            c++;
        }
     
            return prev;
    }
}