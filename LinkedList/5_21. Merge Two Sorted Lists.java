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

 //first we will make our own node and traverse through both nodes
 //we will compare the val of both node and add the smaller one to the next
 //node of our node, till both the nodes are iterated
 // we declared a tempNode and currentNode(for real functioning),
 //tempNode will keep track of headnode and we will return the next in the end

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node; 

        //iterating to the nodes
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current_node.next = list1;
                list1 = list1.next;
            }else{
                current_node.next = list2;
                list2 = list2.next;
            }
            current_node = current_node.next;
        }
        //if list2 is iterated fully and list1 remaining
        if(list1 != null){
            current_node.next = list1;
            list1 = list1.next;
        }
        //if list2 is iterated fully and list1 remaining
        if(list2 != null){
            current_node.next = list2;
            list2 = list2.next;
        }

        return temp_node.next;
    }
}
