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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode placeholder = new ListNode();
        ListNode lastMerged = placeholder;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                lastMerged.next = list1;
                list1 = list1.next;
            } else {
                lastMerged.next = list2;
                list2 = list2.next;
            }
            lastMerged = lastMerged.next;
            }
            if(list1 != null){
                lastMerged.next = list1;
            } else {
                lastMerged.next = list2;
            }

            return placeholder.next;

        }

    }
