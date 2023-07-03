// first we will take current to position pos, 
//using for loop for i = 0 (as zero indexing) till less than pos
//we will cretae a newNode of given data
//after we will check if current is tail, if yes we will use insertAtEnd
//othereise, we will store current next to temp, then make current next point to nwNode
//make newNode prev point to current
//thrn mak newNode next point to temp and temp prev to newNode


class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head, int pos, int data)
	{
	    Node current = head;
	    for(int i = 0; i < pos; i++){
	        current = current.next;
	    }	
	    Node newNode = new Node(data);
	    
	    if(current.next == null){
	        current.next = newNode;
	        newNode.prev = current;
	    }else{
	        Node temp = current.next;
	        current.next = newNode;
	        newNode.prev = current;
	        newNode.next = temp;
	        temp.prev = newNode;
	    }
	}
}
