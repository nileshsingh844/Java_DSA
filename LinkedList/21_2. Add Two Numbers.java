//first we will create a dummy node, and initial a temp node as copy of dummy node
//we will initialize carry = 0,
//then until l1 and l2 equals null, and carry equals zero, we will continue the 
//loop, initialize sum = 0, if l1 not null, add l1 to sum, shift l1 to l1 next
//if l2 not null, add l2 to sum and shift l2 to l2 next, 
//after add carry to sum, and reinitialize it to sum/10 (gives carry)
//after create a new Node, with value (sum % 10), make temp next point to
//this node, shift temp to temp next
//return dummy next

// if 7 + 3 = 10, sum = 10 % 10 = 0 and carry = 10/10 = 1

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
