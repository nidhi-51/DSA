/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        // Step 1: clone node add
        Node temp = head;
        while(temp != null){
            Node cloneNode = new Node(temp.val);
            cloneNode.next = temp.next;
            temp.next = cloneNode;
            temp = cloneNode.next;
        }
        // Step 2: copy random pointers
        temp = head;
        while(temp != null){
            Node oldNode = temp;
            Node newNode = temp.next;
            // observation new node ka random = old node ki next ka random
            if(oldNode.random != null){
                newNode.random = oldNode.random.next;
            }
            // temp ko aage move karna pdega
            temp = newNode.next;
        }
        // step 3: detach the list
        temp = head;
        Node ansListHead = head.next;
        while(temp != null){
            Node oldNode = temp;
            Node cloneNode = temp.next;
            // detach ka logic
            oldNode.next = cloneNode.next;
            if(cloneNode.next != null){
                cloneNode.next = cloneNode.next.next;
            }        
            temp = temp.next;
        }
        return ansListHead;
    }
}