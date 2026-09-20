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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;
        List<Integer> criticalPoint = new ArrayList<>();

        while(curr != null && curr.next != null){
            // compare l maxima
            if(curr.val > prev.val && curr.val > curr.next.val){
                criticalPoint.add(i);
            }
            // compare l minima
            if(curr.val < prev.val && curr.val < curr.next.val){
                criticalPoint.add(i);
            }
            curr = curr.next;
            prev = prev.next;
            i = i+1;
        }

        if(criticalPoint.size() < 2){
            return new int[]{-1,-1};
        }
        //critical points i list ready hoge
        int minDist = Integer.MAX_VALUE;
        for(int j = 1; j < criticalPoint.size(); j++){
            minDist = Math.min(minDist, criticalPoint.get(j) - criticalPoint.get(j-1));
        }

        int maxDist = criticalPoint.get(criticalPoint.size() - 1) - criticalPoint.get(0);

        return new int[]{minDist, maxDist};
    }
}