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

//In brute force approach, we find the length of list, then iterate to prev node of middle, using (length/2) - 1 , 
//then make its next point to next next

//Most Optimized
//we will use fast and slow pointer approach, Time complexity: O(n), space: O(1)
//we need to find the node previous to middle node and then make it point to
//its next next
//if only one element, return null
//we will declare fast and slow pointer, slow point to head and
//FAST POINTS to head next next
//until fast reaches the end, fast traverse double the speed of slow
//slow points to node prev of middle node
//mak slow next point to slow next next and return head

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow, fast;
        slow = head;
        fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
