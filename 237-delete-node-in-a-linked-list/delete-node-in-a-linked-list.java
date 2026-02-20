/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        ListNode curr = node;
        ListNode next = null;

        while (curr.next.next != null){
            next = curr.next;
            curr.val = next.val;
            curr = next;
        }
        curr.val = curr.next.val;
        curr.next = null;


        
    }
}