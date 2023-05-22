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
//In brute force where first we find the lenght then goto prev node to delete, time complxity is O(2n)

//we will use one pass approach, time complexity O(n) space: O(1)
//we will create a dummy_head node to keep track of head, and return 
//dummy_head next, as it point to original head of the given list
//now make fast and slow pointer, 
//first we will make the fast pointer iterate till (n+1)th node, then 
//until fast reaches the end, we will make fast and slow iterate one step 
//each, now slow will point to one node back to the node we need to delete
//so we will make slow next point to slow next next
//return the dummy_head

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        ListNode fast, slow;
        fast = slow = dummy_head;
        for(int i = 1; i <= n+1; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;


        return dummy_head.next;
    }
}
