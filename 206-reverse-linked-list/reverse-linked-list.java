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
        ListNode pre = null;
        ListNode curr = head;
        ListNode ans = solve(pre, curr);
        return ans;
    }
    public ListNode solve(ListNode pre, ListNode curr){
        if(curr == null){
            return pre;
        }
        ListNode forward = curr.next;
        curr.next = pre;
        // aage badhega
        pre = curr;
        curr = forward;
         return solve(pre, curr);
    }
}