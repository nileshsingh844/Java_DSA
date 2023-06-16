//DoublyLinkedList Implementation
//first we will create a Node class
class Node{
    //it has three members, data, prev, next
    int data;
    Node prev;
    Node next;
    
    //Constructor for node class, assigning given data to data,
    //and pointing prev and next to null
    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

//we will create DoublyLinkedList class
class DoublyLinkedList{
    //It has two members head and tail, head is the first node, tail
    //is last node
    Node head;
    Node tail;
    
    //Constructor, assigning head and tail to null
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        }
        
        //method to manipulate the list
        public void insertAtEnd(int data){
            // first we will create a newNode
            Node newNode = new Node(data);
            //if list empty, make newNode the head and tail
            if(head == null){
                this.head = newNode;
                this.tail = newNode;
            }else{
                //first make tail next point to newNode, then 
                //make newNode prev point to tail, then make 
                //the tail newNode
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        
        public void delete(int data){
            Node current = this.head;
            while(current != null){
                //find the node to be deleted, and apply conditions
                if(current.data == data){
                    if(current == head){
                        head = head.next;
                        if(head != null){
                            head.prev = null;
                        }
                        }else if(current == tail){
                            tail = tail.prev;
                            if(tail != null){
                                tail.next = null;
                            }
                        }else{
                            current.next.prev = current.prev;
                            current.prev.next = current.next;
                        }
                    
                }
                current = current.next;
            }
        }
        public void display(){
            Node current = this.head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print("null");
            System.out.println();
        }
}


class Main{
    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        
        dll.insertAtEnd(11);
        dll.insertAtEnd(12);
        dll.insertAtEnd(13);
        dll.insertAtEnd(14);
        
        dll.display();
        
        dll.delete(11);
        dll.display();
        
        dll.delete(14);
        dll.display();
        
        dll.delete(12);
        dll.display();
    }
}
