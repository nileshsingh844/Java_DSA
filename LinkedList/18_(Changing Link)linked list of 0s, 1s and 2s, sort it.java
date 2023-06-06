//we will do by changing the links
//we will initialize three dummy heads, zeroHead, oneHead, twoHead
//and three pointers zero, one and two, 
//initially all pointers point to their rspective dummy heads
//until current reaches end, we will create separate list of zero, one, and two
//after we will join them checking the empty conditions
//if oneHead is empty we will point one next to twoHead
//then we will add one next to twohead next, and point two next to null
//return zeroHead next


class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node zeroHead = new Node(0);
        Node oneHead = new Node(0);
        Node twoHead = new Node(0);
        Node  zero, one, two;
        zero = zeroHead;
        one = oneHead;
        two = twoHead;
        
        Node current = head;
        while(current != null){
            if(current.data == 0){
                zero.next = current;
                zero = current;
            }else if(current.data == 1){
                one.next = current;
                one = current;
            }else if(current.data == 2){
                two.next = current;
                two = current;
            }
            current = current.next;
        }
        
        if(oneHead.next != null){
            zero.next = oneHead.next;
        }else{
            zero.next = twoHead.next;
        }
        one.next = twoHead.next;
        two.next = null;
        
        return zeroHead.next;
    }
}


