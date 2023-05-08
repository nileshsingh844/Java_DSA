/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//we will use two pointer approach,slow and fast and traverse till slow != fast
//slow point to head and fast point to next of head
//slow will move one step while fast will move two steps at time,
//we will check two condition, if list is empty then we will return false
//if fast reaches the end then there's no cycle (condition 2) return false
//if any other case then the list has cycle, return true

public class Solution {
    public boolean hasCycle(ListNode head) {
        //Condition 1 
        if(head == null){
            return false;
        }
        
        ListNode slow, fast;
        slow = head;
        fast = head.next;
        while(slow != fast){
            //means that it reached to end
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
