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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        ListNode oddTail = head;
        ListNode oddHead = head;
        ListNode evenTail = head.next;
        ListNode evenHead = head.next;

        while(evenTail != null && evenTail.next != null){
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;
            evenTail.next = oddTail.next;
            evenTail = oddTail.next; 
        }
        // connecting links between odd and even links
        oddTail.next = evenHead;

        // returning modified head
        return head;
    }
}