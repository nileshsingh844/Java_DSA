//first we will create current and temp pointers
//until current reaches end, we will swap prev and next link of node
//first we will store current prev in temp
//then we will point current prev to current next node
//now make current next node point to temp,
//shift current to current prev, (which was current next before)
//at end, if temp is not null, make head point to temp prev(last node)
//return head

*/
public static Node reverseDLL(Node  head)
{
    Node temp, current;
    temp = null;
    current = head;
    
    while(current != null){
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
    }
    
    if(temp != null){
        head = temp.prev;
    }
    return head;
}
