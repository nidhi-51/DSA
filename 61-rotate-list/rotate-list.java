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
      if(head == null || k == 0){
        return head;
      }  
      ListNode temp = head;
      int len = 1;
      while(temp.next != null){
        len++;
        temp = temp.next;
      }
      // circular links
      temp.next = head;

      // k ko update karo

      k = k % len;

      // link break
      temp = head;
      for(int i = 1; i <= len-k-1; i++){
        temp = temp.next;
      }
      ListNode forward = temp.next;

      temp.next = null;

      return forward;
    }
}