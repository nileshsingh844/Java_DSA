//Recursive approach

//we gonna intoduce two pointers in program, newHead, headNext in our program
//first we will check the base condition if list is empty or singleton, return head
//then declare newNode and call recursive function passing head next as parameter
//now declare and make headNext point to head.next
//now make headNext next point to head, and then head next point to null
//return newHead

// 1 -> 2 -> 3 -> 4 -> 5 
//Imagine newHead is 5, headNext is 2, head is 1
//headNext next points head implies,  2 point to 1 
//head next points to null implies, 1 points to null
//we will return newHead,  5->4->3->2->1->null

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = reverseList(head.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newhead;
    }
}
