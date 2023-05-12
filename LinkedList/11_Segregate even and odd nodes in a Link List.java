// Given a link list of size N, modify the list such that all the even numbers appear 
// before all the odd numbers in the modified list.
// The order of appearance of numbers within each segregation should be same as that in the original list.

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

//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

//we will use 5 pointers,first current to iterate through the list
//odd, even to keep track of even and odd head, o & e to iterate, all null initially
//we will check, if current val is even,
//then we will check if even is null, if yes then assign even and e to current, else
//point the next of e to current and move e to e.next
//similary we will do for odd contion in else block
//after coming out of while loop, we will check if e is not null, point e.next to odd
//then if o exist, point o next to null,
//if even exist return even, else return odd


class Solution{
    Node divide(int N, Node head){
        Node current = head;
        Node even, odd, o, e;
        even = odd = o = e = null;
        while(current != null){
            if(current.data % 2 == 0){
                if(even == null){
                    even = current;
                    e = current;
                }else{
                    e.next = current;
                    e = e.next;
                }
            }else{
                if(odd == null){
                    odd = current;
                    o = current;
                }else{
                    o.next = current;
                    o = o.next;
                }
            }
            current = current.next;
        }
        if(e != null) e.next = odd;
        if(o != null) o.next = null;
        if(even != null){
            return even;
        }else{
            return odd;
        }
    }
}
