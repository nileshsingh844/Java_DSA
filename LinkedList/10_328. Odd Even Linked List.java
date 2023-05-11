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

//we will use three pointers, odd poiinting to head, even pointing to head next, 
// and evenHead pointing to head next
//then we will iterate until odd.next or even.next points null
//first we will make the odd next point to even next, then shift odd pointer to odd next
//then we make even next point to current odd next, then shift the even to current even next
//until loop breaks, then we make the odd next point to evenHead, 
//then we will return the head(the odd pointer shifted right next in each step, thats why its not head anymore, cant return it)

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(odd.next != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
