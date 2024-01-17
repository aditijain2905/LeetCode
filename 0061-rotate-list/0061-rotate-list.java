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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode temp=head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        k=k%length;
       // System.out.print(k);
        if((k==0 && length==2) || k==0) return head;
        if(k==1 && length==2) {
            temp.next=head;
            head.next=null;
            return temp;
        }
        ListNode s=head;
        for(int i=0;i<length-k-1;i++){
            s=s.next;
        }
        
       ListNode r=s.next;
        s.next=null;
        temp.next=head;
        return r;
    }
}