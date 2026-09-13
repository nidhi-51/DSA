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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode list2 = middle(head);
        ListNode temp = head;
        while(temp.next != list2){
          temp = temp.next;  
        }

        temp.next = null;

        ListNode list1 = head;

        ListNode sorted1 = sortList(list1);
        ListNode sorted2 = sortList(list2);

        return merge(sorted1, sorted2);
    }
    static ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
    static ListNode merge(ListNode sorted1, ListNode sorted2){
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(sorted1 != null && sorted2 != null){
            if(sorted1.val < sorted2.val){
                curr.next = sorted1;
                sorted1 = sorted1.next;
            }
            else{
                curr.next = sorted2;
                sorted2 = sorted2.next;
            }
            curr = curr.next;
        }
            if(sorted1 != null){
                curr.next = sorted1;
            }
            else{
                curr.next = sorted2;
            }
        
        return dummy.next;
    }
}