class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	    Node current = head;
	    for(int i = 1; i < x ; i++){
	        current = current.next;
	    }
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
	    
	    return head;
    }
}
