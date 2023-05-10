/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/
//Function should return the length of the loop in LL.

    //we will use two pointer approach, slow and fast
    //slow and fast pointing head initially, and fast moving twice speed of slow
    //using the stopping condition, when fast raches the end, i.e. no cycle
    //we find the point where slow and fast meet, we declare a temp node and assign
    //it to slow, and declare an integer, count = 1, and iterate temp using stopping condition        
    //i.e when temp.next get equal to slow, loop breaks, then we return the count

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node fast, slow;
        fast = slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node temp = slow;
                int count = 1;
                while(temp.next != slow){
                    count++ ;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }
}
