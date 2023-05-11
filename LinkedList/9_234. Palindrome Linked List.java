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

//we will use two pointer approach, fast and slow, and find the mid node of Linkedlist
//fast will traverse twice the speed of slow, till fast reaches the end
//then, we will reverse the list after mid and update into slow, and point fast to head
//next we will comapare value of fast and reversed list, until slow reaches end
//moving slow and fast by one step each
//if value mismatch return false, else return true 

class Solution {

    public ListNode rev(ListNode head){
        ListNode current, prev;
        current = head;
        prev = null;
        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = rev(slow);
        fast = head;
        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}
