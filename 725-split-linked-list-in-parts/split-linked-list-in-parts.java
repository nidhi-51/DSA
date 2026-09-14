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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int baseSize = (len/k);
        int extraNode = (len % k);
        // main logic
        ListNode prev = null;
        ListNode curr = head;
        
        for(int part = 0; part < k; part++){
            // dimag lagane wala point agar curr me sirf null hai null insert kro aur nhi hai to neeche wala part kro
            if(curr == null){
                ans[part] = curr;
                continue;
            }
            // insert curr into array
            ans[part] = curr;
            // find the width of current sublist
            int width = baseSize + (extraNode > 0 ? 1 : 0);
            //decrement extranodes
            extraNode--;
            for(int i = 1; i <= width; i++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            // next iteration pe move kro
            prev = null;
        }
        return ans;
    }
}