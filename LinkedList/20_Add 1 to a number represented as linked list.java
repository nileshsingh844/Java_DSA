//we need to point to the last node, so first we will reverse the list
//we will check three conditions, 
//if the current is 9 and its next is null, we will change the data to one and insertAtHead 0
//if current is 9, we will make it zero, and shift to next
//if current is not 9, we will incremnet data by one, shift the current and break
//we will reverse the list again and return the list



class Solution
{
    public static Node reverse(Node head){
        Node current, prev;
        current = head;
        prev = null;
        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        head = reverse(head);
        Node current = head;
        
        while(current != null){
            if(current.data == 9 && current.next == null){
                current.data = 1;
                Node newNode = new Node(0);
                newNode.next = head;
                head = newNode;
                current = current.next;
            }else if(current.data == 9){
                current.data = 0;
                current = current.next;
            }else{
                current.data = current.data + 1;
                current = current.next;
                break;
            }
        }
        head = reverse(head);
        return head;
    }
}
