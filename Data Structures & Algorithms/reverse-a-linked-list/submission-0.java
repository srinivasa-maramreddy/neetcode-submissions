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
         if (head == null) return null;

        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        // Push all nodes onto stack
        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }

        // Pop to rebuild reversed list
        ListNode newHead = st.pop();  // first popped = last node
        temp = newHead;

        while (!st.isEmpty()) {
            temp.next = st.pop();
            temp = temp.next;
        }

        temp.next = null; // end the reversed list

        return newHead;
    }
}
