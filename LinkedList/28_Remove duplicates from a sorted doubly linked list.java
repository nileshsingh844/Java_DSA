//we will start with head,until current reaches last end
//if current data equals current next's data, 
//make current next point to current next next(remove current next)
//if current next is not null, connect its prev pointer to current
//otherwise if current next is distinct, shift current to current next
//return head
//Time o(n) Space o(1) constant

class Solution{
    Node removeDuplicates(Node head){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
                if(current.next != null){
                    current.next.prev = current;
                }
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
