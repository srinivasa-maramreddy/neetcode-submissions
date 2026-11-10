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
    public void reorderList(ListNode head) {
     
       ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2️⃣ Reverse second half
        ListNode second = Reverse(slow.next);
        slow.next = null;

        // 3️⃣ Merge two halves
        ListNode first = head;
        while (second != null) {
           

           ListNode fNext = first.next;
            ListNode sNext = second.next;

            first.next = second;
            second.next = fNext;

            first = fNext;
            second = sNext;
        } 
    }
    public static ListNode Reverse(ListNode head){
      ListNode temp=head;
      ListNode prev=null;
      while(temp!=null){
        ListNode front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
        
      }
      return prev;
    }
}
