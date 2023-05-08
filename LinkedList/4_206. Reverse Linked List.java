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

 //we will use two pointers, a prev which is null at first
 //and a current pointer which points to the head
 //first we will save the next node of curr in temp
 //then we will make the current point to prev
 //then we will shift the prev and curr point by one step to right
 //so that the prev will take place of current head, and current head points
 //to the head element of the temp


class Solution {
    public ListNode reverseList(ListNode head) {
        //base condition: if list empty return null
        if(head == null ){
            return null;
        }
        //define pointers
        ListNode cur = head , pre = null;
        while(cur != null){
            //save the nodes next to the cur(which is the head at present)
            ListNode temp = cur.next;
            cur.next = pre;
            //now shift pre and cur to right
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
