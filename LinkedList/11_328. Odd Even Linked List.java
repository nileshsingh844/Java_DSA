// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.
// Note that the relative order inside both the even and odd groups should remain as it was in the input.
// You must solve the problem in O(1) extra space complexity and O(n) time complexity.

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

//we will use three pointers, odd pointing head initially, even pointing head next, and evenNode pointing same as even
//we will iterate until odd or even reaches end
//we will make, odd next point to even next and then move odd to odd next
//then we will make even next point to odd next and move even to even next
//then we will point odd next to even head

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
