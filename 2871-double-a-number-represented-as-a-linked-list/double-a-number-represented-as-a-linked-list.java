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
    public ListNode doubleIt(ListNode head) {
        ListNode revHead = reverse(head);
        ListNode curr2 = revHead;
        ListNode prev = new ListNode(0);
        prev.next = curr2;
        int carry = 0;

        while(curr2 != null){
            int sum = curr2.val * 2 + carry;
            curr2.val = sum % 10;

            if(sum > 9){
                carry = 1;
            }
            else{
                carry = 0;
            }
            curr2 = curr2.next;
            prev = prev.next;
          }
            if(carry == 1){
                prev.next = new ListNode(1);
            }
            return reverse(revHead);
    }
    static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}