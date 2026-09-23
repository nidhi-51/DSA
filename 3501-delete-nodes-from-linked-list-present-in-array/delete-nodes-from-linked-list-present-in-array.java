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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
         for(int num: nums){
                set.add(num);
            }
        // head node he present ho array me pehle
        while(head != null){
        boolean found = set.contains(head.val);
            if(found){
                head = head.next;
            }
            else{
                break;
            }
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            boolean found = set.contains(curr.val);
            if(found){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}