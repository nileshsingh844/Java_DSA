//1290. Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head) {
        //First we will initialize a variable num
        int num = 0;
        //we will traverse through linkedlist
        while(head != null){
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }
}

// Let Given LinkedList a -> b -> c 
//logic : (num = num * 2 + head.val)
// num = 0
//Traversing through list
//num = 0 * 2 + a
//num = (0 * 2 + a) * 2 + b
//num = ((0 * 2 + a) * 2 + b) + c
//after solving
// (num = a * 2^2 + b * 2^1 + c*2^0) -> this convert the binary to decimal
