//we will create a current pointing to head
//until current reaches end, if current data equals key x,
//we will delete it, according if its head, tail or inbetween node
//if its head make head point to head next, if list not empty, make head prev point to null
//if its tail(current next is null), make current point to current prev, if current not null
//make current next point to null
//if its inbetween, make current prev's next point to current's next, and 
//current next's prev point to current's prev
//repeat until current traverse and check each node
//return head

class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node current = head;
        while(current != null){
            if(current.data == x){
                if(current == head){
                    head = head.next;
                    if(head != null){
                        head.prev = null;
                    }
                }else if(current.next == null){
                    current = current.prev;
                    if(current != null){
                        current.next = null;
                    }
                }else{
                    current.next.prev = current.prev;
                    current.prev.next = current.next;
                }
            }
            current = current.next;
        }
        return head;
    }
}
