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
        ListNode last = head;
        int size = 0;
        while(last.next != null){
            size++;
            last = last.next;
        }
        ListNode first = head;
        while(first != null && first.next != null && first.next.next != null){
        ListNode second = first.next;
        ListNode lastprev = head;
        for(int i = 1; i < size; i++){
            lastprev = lastprev.next;
        }
        first.next = last;
        last.next = second;
        lastprev.next = null;
        first = second;
        last = lastprev;
        } 
    }
}