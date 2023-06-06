//we will use two pointrs, a_pointer nd b_pointer, pointing the head respectively
//if lists null or singleton, return null
//until both pointers meet, we will make them traverse, when one reaches the
//end, we will make it point to head of other, and continue
//return any of pointer, a_pointer
//in this approach, since the length of list part before intersection is
//unequal, by doing this way, we're making the pointer cover equal node
//while traversal, and eventually meet

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode a_pointer, b_pointer;
        a_pointer = headA;
        b_pointer = headB;

        while( a_pointer != b_pointer){
            if(a_pointer == null){
                a_pointer = headB;
            }else{
                a_pointer = a_pointer.next;
            }
            
            if(b_pointer == null){
                b_pointer = headA;
            }else{
                b_pointer = b_pointer.next;
            }
            
        }
        return a_pointer;
    }
}
