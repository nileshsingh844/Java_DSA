// Given a linked list consisting of L nodes and given a number N. 
// The task is to find the Nth node from the end of the linked list.
//N = 2
// LinkedList: 1->2->3->4->5->6->7->8->9
// Output: 8

//we will do in one pass using two pointer approach,
//for n-1 time make fast shift to fast next
//until fast reaches end, i.e fast next points null, make slow and fast 
//traverse one step each, at the end slow points to nth node from last

//one condition to check,that if fast reaches end, n > length of list 
//that fast.next == null, return -1


class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	Node slow, fast;
    	slow = fast = head;
    	for(int i = 1; i <= n-1; i++){
    	    fast = fast.next;
        //Important
    	    if(fast == null){
    	        return -1;
    	    }
    	}
    	while(fast.next != null){
    	    slow = slow.next;
    	    fast = fast.next;
    	}
    	return slow.data;
    }
}
