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
    public boolean hasCycle(ListNode head) {
        List<ListNode> l = new ArrayList<>();

        while(head != null){
            if(l.contains(head)){
                //returns true if there the linked list loops.
                return true;
            }
            l.add(head);
            //if the linked list loops, this will not work;
            head = head.next;
        }
        return false;
    }
}
