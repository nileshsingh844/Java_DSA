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

    //We will use fast and slow pointer approach
    //we will declare two pointer, one will traverse the linkedlist double 
    //the speed of other, so when the one reach the end, the other is still 
    //at the middle, then we return the middle position of slow pointer

class Solution {
    public ListNode middleNode(ListNode head) {
        //Initializing two pointer and ponting them to head
        ListNode fast, slow;
        fast = slow = head;

        //adding termination condition on the fast & moving the slow one step
        //and fast pointer double the speed i.e. two step at a time

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
