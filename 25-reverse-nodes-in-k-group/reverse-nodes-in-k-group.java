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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len < k){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 1; i <= k; i++){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        // remainning list ko recursion se solve karna hai 
        ListNode recursionKaAnswer = reverseKGroup(curr, k);
        // ans ko list se join karna
        head.next = recursionKaAnswer;

        return prev;
    }
}