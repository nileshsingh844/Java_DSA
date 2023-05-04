//Linked List implementation
//First we will create a Node class
class Node{
    //we will declare two members of Node
    private int data;
    private Node nextNode;
    
    //since we declare using access modifier private,
    //we need to use getters and setters to access the members
    
    //Constructor for Node class
    public Node(int data){
        this.data = data;
    }
    
    public int getData(){
        return this.data;
    }
    public Node getNextNode(){
        return this.nextNode;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNextNode(Node newNode){
        this.nextNode = newNode;
    }
    
    //Override the toString method of object class to print Node
    @Override
    public String toString(){
        return "Data: " + this.data;
    }
}

class LinkedList{
    //Single lisked list has only one reference to head
    private Node head;
    
    //declaring methods to manipulate the linkedlist
    public void insertFromHead(int data){
        //first we will create a new Node
        Node newNode = new Node(data);
        //the newNode will now point to current head
        newNode.setNextNode(this.head);
        //the head will now point to new Node
        this.head = newNode;
    }
    
    public void insertFromTail(int data){
        //we will create a new Node
        Node newNode = new Node(data);
        //we will check if the list is empty, if empty 
        //newNode will be the head
        if(this.head == null){
            this.head = newNode;
        }
        else{
            //we will initialize a current variable and point 
            //it to head
            Node current = this.head;
            while(current.getNextNode() != null){
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
            
        }
    }
    
    public int length(){
        int length = 0;
        Node current = this.head;
        
        while(current != null){
            length ++;
            current = current.getNextNode();
        }
        return length;
    }
    
    public void deleteFromHead(){
        //To delete from head we need to point the head to the next
        //node of the current head
        this.head = this.head.getNextNode();
    }
    
    public Node find(int data){
        Node current = this.head;
        while(current != null){
            if(current.getData() == data){
                return current; 
            }
            current = current.getNextNode();
        }
        return null;
    }
    
    //Overriding the toString method of Object class
    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;
        while(current != null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
    
    
}


class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFromHead(12);
        list.insertFromHead(14);
        list.insertFromHead(18);
        list.insertFromTail(11);
        list.insertFromTail(15);
        list.insertFromTail(17);
        list.deleteFromHead();
        
        System.out.println(list + "\n");
        System.out.println(list.length());
        System.out.println(list.find(11));
        System.out.println(list.find(111));
    }
}
