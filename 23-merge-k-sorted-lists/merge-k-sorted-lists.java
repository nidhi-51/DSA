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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        return merge(lists, 0);
    }
    static ListNode merge(ListNode[] lists, int index){
        if(index == lists.length - 1){
            return lists[index];
        }
        ListNode rest = merge(lists, index + 1);

        return mergeTwoLists(lists[index], rest);
    }
    static ListNode mergeTwoLists(ListNode a, ListNode b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        if(a.val < b.val){
            a.next = mergeTwoLists(a.next, b);
            return a;
        }
        else{
            b.next = mergeTwoLists(b.next, a);
            return b;
        }
    }
}