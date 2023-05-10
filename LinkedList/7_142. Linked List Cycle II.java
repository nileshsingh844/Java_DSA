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
//NOTE: IF USING HASH TABLE TIME COMPLEXITY IS O(N) AND SPACE COMPLEXITY O(N)

//IN THIS APPROACH THE TIME COMPLEXITY IS O(N) AND SPACE COMPLEXITY IS O(1)
 //we will use two pointer approach, slow and fast
 //we will iterate both, fast twice the speed of slow
 //we will use the stopping condition, that is, when the fast reaches the end,
 //if reaches end, no cycle, loop breaks and we return null
 //otherwise, we check the point where fast and slow meets
 //at that point, we assign slow to head and again start moving slow and fast
 // one step each, until they both meet at point(stopping condition)
 //we will return the node where they meet as the starting point of cycle
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
            
        }
        return null;
    }
}
